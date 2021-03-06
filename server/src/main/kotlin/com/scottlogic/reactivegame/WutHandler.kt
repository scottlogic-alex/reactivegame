package com.scottlogic.reactivegame

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.ObjectMapper
import com.scottlogic.reactivegame.services.JsonWebTokenService
import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketMessage
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.Disposable
import reactor.core.publisher.Flux
import reactor.core.publisher.FluxSink
import reactor.core.publisher.Mono
import java.sql.Timestamp
import java.time.Duration
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.timerTask
import kotlin.math.pow
import kotlin.random.Random

data class Collisions (
        var collidees: ArrayList<Position>
)

data class Position (
        var x: Int,
        var y: Int
)

data class PlayerState @ExperimentalUnsignedTypes constructor(
        var username: String,
        @JsonIgnore
        val userId: String,
        val positions: ArrayDeque<Position>,
        var colour: String,
        @JsonIgnore
        val mousePosition: Position,
        @JsonIgnore
        var angle: Double,
        var points: Int,
        var hat: String?,
        var highScore: Int
)

data class GameState (
        val playerStates: MutableList<PlayerState>,
        var recent: Position,
        var apple: Position?,
        var hat: HatDrop?
)

data class HatDrop (
        val position: Position,
        var type: String
)

data class Cookie (
        val key: String,
        val value: String
)

@Component
class WiggleCounter(val registry: MeterRegistry) {
    val coolMap: MutableMap<String, Counter> = mutableMapOf()
}

@Component
class WutHandler: WebSocketHandler, InitializingBean, DisposableBean {

    override fun afterPropertiesSet() {
        disposableSubscription = physicsUpdate.subscribe{
            synchronized(gameState.playerStates){
                gameState.playerStates.forEach { thisPlayerState ->
                    if (thisPlayerState.positions.size > 0) {
                        val newLocation: Position = calculatePosition(thisPlayerState)
                        updatePositions(thisPlayerState, newLocation)
                    }
                }
            }
        }

        colourUpdateSubscription = userColourUpdate.colourChanges.subscribe{
            gameState.playerStates.forEach { player ->
                if (player.userId == it.userId) {
                    player.colour = it.colour
                }
            }
            sink?.next(Unit)
        }

        nameUpdateSubscription = userNameUpdate.nameChanges.subscribe{
            gameState.playerStates.forEach { player ->
                if (player.userId == it.userId) {
                    player.username = it.userName
                }
            }
            sink?.next(Unit)
        }

        appleDropSubscription = appleDrop.subscribe{
            val x: Int = Random.nextInt(100, 1900)
            val y: Int = Random.nextInt(100, 900)
            gameState.apple = Position(x = x, y = y)
            sink?.next(Unit)
        }

        hatDropSubscription = hatDrop.subscribe{
            val x: Int = Random.nextInt(100, 1900)
            val y: Int = Random.nextInt(100, 900)
            val type: String = hats[Random.nextInt(0, 9)]
            gameState.hat = HatDrop(position = Position(x = x, y = y), type = type)
            sink?.next(Unit)
            val timer = Timer()
            timer.schedule(timerTask{
                gameState.hat = null
                sink?.next(Unit)
            }, 10000)
        }
    }

    override fun destroy() {
        System.out.println("destroying")
        disposableSubscription?.dispose()
        colourUpdateSubscription?.dispose()
    }

    private val gameState: GameState = GameState(
            playerStates = mutableListOf(),
            recent = Position(x = -100, y = -100),
            apple = null,
            hat = null
    )
    private val safeDots: Collisions = Collisions(collidees = ArrayList())
    private val coordRegex: Regex = Regex("X: (\\d+), Y: (\\d+)")
    private var sink: FluxSink<Unit>? = null
    private val gameChanges = Flux.create<Unit>{
        sink = it
        it.next(Unit)
    }.publish().autoConnect() //.share()
    private val physicsUpdate = Flux.interval(Duration.ofMillis(100L)).publish().autoConnect()
    private val appleDrop = Flux.interval(Duration.ofMillis(5000L)).publish().autoConnect()
    private val hatDrop = Flux.interval(Duration.ofSeconds(Random.nextLong(60, 180))).publish().autoConnect()
    private var colourUpdateSubscription: Disposable? = null
    private var nameUpdateSubscription: Disposable? = null
    private var disposableSubscription: Disposable? = null
    private var appleDropSubscription: Disposable? = null
    private var hatDropSubscription: Disposable? = null
    private val hats: Array<String> = arrayOf("fedora", "sombrero", "cowboy", "mortarboard", "ranger", "santa", "snapback", "spacehelmet", "sunhat")
    @Autowired
    private lateinit var userRepository: UserRepository
    @Autowired
    private lateinit var userNameUpdate: UserNameUpdate
    @Autowired
    private lateinit var userColourUpdate: UserColourUpdate
    @Autowired
    private lateinit var objectMapper: ObjectMapper
    @Autowired
    private lateinit var jwtService: JsonWebTokenService
    @Autowired
    private lateinit var wiggleCounter: WiggleCounter

    fun collision(existing: Position, toDraw: Position): Boolean {
        synchronized(safeDots.collidees) {
            if (safeDots.collidees.find { position -> position.x == existing.x && position.y == existing.y } == null) {
                return (
                        (existing.x - toDraw.x).toDouble().pow(2) + (existing.y - toDraw.y).toDouble().pow(2) < 20.0.pow(2)
                        )
            }
        }
        return false
    }

    fun itemCollect(wormPosition: Position, itemPosition: Position): Boolean {
        return (wormPosition.x - (itemPosition.x + 35)).toDouble().pow(2) + (wormPosition.y - (itemPosition.y + 35)).toDouble().pow(2) < 40.0.pow(2)
    }

    fun waitOneSec(coordinates: List<Position>){
        val timer = Timer()
        timer.schedule(timerTask{
            synchronized(safeDots.collidees) {
                safeDots.collidees.removeAll(coordinates)
            }
        }, 1000)
    }

    @Synchronized fun calculatePosition(thisPlayerState: PlayerState): Position {
            val oldPosition = thisPlayerState.positions.last()
            val dx = (thisPlayerState.mousePosition.x - oldPosition.x).toDouble()
            val dy = (thisPlayerState.mousePosition.y - oldPosition.y).toDouble()
            var theta = Math.atan2(dy, dx)

            val maxAngle = 0.628319

            val compromise: Double
            val current = thisPlayerState.angle + Math.PI
            val intended = theta + Math.PI
            val upper = current + maxAngle
            val lower = current - maxAngle

            if (Math.abs(intended - current) < Math.PI) {
                if (intended >= current) {
                    compromise = Math.min(intended, upper) - Math.PI
                } else {
                    compromise = Math.max(intended, lower) - Math.PI
                }
            } else {
                if (intended >= current) {
                    if (lower > 0) {
                        compromise = lower - Math.PI
                    } else {
                        compromise = lower + Math.PI
                    }
                } else {
                    if (upper < 2 * Math.PI) {
                        compromise = upper - Math.PI
                    } else {
                        compromise = upper - 3 * Math.PI
                    }
                }
            }
            thisPlayerState.angle = compromise
            val maxMovement = 20
            val x = oldPosition.x + (Math.cos(compromise) * maxMovement)
            val y = oldPosition.y + (Math.sin(compromise) * maxMovement)
            return Position(x.toInt(), y.toInt())
    }

    fun updatePositions(thisPlayerState: PlayerState, currentCoordinate: Position) {
        if (thisPlayerState.positions.size >= 10) thisPlayerState.positions.pop()
        thisPlayerState.positions.addLast(currentCoordinate)
        val obstacles = arrayListOf<Position>()
        synchronized(gameState) {
            gameState.playerStates.forEach { user -> if (user.userId !== thisPlayerState.userId) obstacles.addAll(user.positions) }
            gameState.recent = Position(x = -100, y = -100)
        }
            val collisions = obstacles.filter { position -> collision(position, currentCoordinate) }
        if (collisions.isNotEmpty()) {
            synchronized(safeDots.collidees) {
                safeDots.collidees.addAll(collisions)
            }
            waitOneSec(collisions)
            gameState.recent = currentCoordinate
        }
        if (gameState.apple != null && itemCollect(currentCoordinate, gameState.apple!!)) {
            thisPlayerState.points++
            gameState.apple = null
        }

        hatCollect(currentCoordinate, thisPlayerState)

        sink?.next(Unit)
    }

    @Synchronized fun hatCollect(currentCoordinate: Position, thisPlayerState: PlayerState) {
        val hat = gameState.hat
        if (hat != null && itemCollect(currentCoordinate, hat.position)) {
            val user = userRepository.findById(thisPlayerState.userId).get()
            if (user.items.filterIsInstance<Hat>().find{userHat -> userHat.name == hat.type} == null) {
                var newHat = Hat()
                newHat.name = hat.type
                newHat.inUse = false
                newHat.consumable = false
                newHat.user = user
                newHat.id = UUID.randomUUID().toString()
                user.items += newHat
                userRepository.save(user)
            }
            gameState.hat = null
        }

    }

    fun updateUserOnClose(thisPlayerState: PlayerState) {
        synchronized(gameState.playerStates) {
            userRepository.updateUserCurrentPointsById(
                    points = thisPlayerState.points,
                    id = thisPlayerState.userId)
            userRepository.updateUserLastActivityById(id = thisPlayerState.userId)
            if (thisPlayerState.points > thisPlayerState.highScore) {
                userRepository.updateUserHighScoreById(
                        score = thisPlayerState.points,
                        id = thisPlayerState.userId)
            }
            gameState.playerStates -= thisPlayerState
            sink?.next(Unit)
        }
    }

    fun setCurrentPoints(existingUser: User): Int {
        if (existingUser.last_activity > Instant.now().minus(5, ChronoUnit.MINUTES)) {
            return existingUser.current_points
        }
        return 0
    }

    @ExperimentalUnsignedTypes
    override fun handle(session: WebSocketSession): Mono<Void> {
        val cookieStrings = session.handshakeInfo.headers.getValue("Cookie").toString().removePrefix("[").removeSuffix("]").split(";")

        val cookies = cookieStrings.map { cookie ->
            val arr = cookie.split("=")
            Cookie(key = arr[0], value = arr[1])
        }

        val cookie = cookies.find { cookiePair -> cookiePair.key == "id" }

        println(Timestamp(Date().time))
        println(cookie)

        var user: Optional<User> = Optional.empty()
        if (cookie != null && jwtService.validateToken(cookie.value)) {
            val userId = jwtService.getUserIdFromJWT(cookie.value)
            if (userId != null) {
                user = userRepository.findById(userId)
            }
        } else {
            return(Mono.error(Throwable("user not found")))
        }

        println(objectMapper.writeValueAsString(user))

        val thisPlayerState: PlayerState
        var hat: String? = ""

        if (user.isPresent) {
            val existingUser = user.get()
            if (existingUser.items.isNotEmpty()) {
                hat = existingUser.items.filterIsInstance<Hat>().find { hat -> hat.inUse == true }?.name
            }

        if (gameState.playerStates.find{ user -> user.userId == existingUser.id } != null) {
            println("throwing error, user session already exists")
            return(Mono.error(Throwable("user session already exists")))
        }

        thisPlayerState = PlayerState(
                userId = existingUser.id,
                username = existingUser.name,
                positions = ArrayDeque(),
                colour = existingUser.colour,
                mousePosition = Position(-1, -1),
                angle = 0.0,
                points = 0,
                hat = hat,
                highScore = existingUser.high_score
        )

        thisPlayerState.points = setCurrentPoints(existingUser)

        synchronized(gameState.playerStates) {
            gameState.playerStates += thisPlayerState
        }
        } else {
            println("throwing error, cannot find user with cookie id in database")
            return(Mono.error(Throwable("user not found")))
        }
        val counter = wiggleCounter.coolMap.computeIfAbsent(user.get().id) { wiggleCounter.registry.counter("wiggles", "user", user.get().email.removeSuffix("@scottlogic.com"))}

        sink?.next(Unit)

        return session.send(
                gameChanges
                        .map {
                            synchronized(gameState.playerStates) {
                                objectMapper.writeValueAsString(gameState)
                            }
                        }
                        .map(session::textMessage)

        ).and(
                session.receive()
                        .map {
                            val find = coordRegex.find(it.payloadAsText)
                            if (find != null) {
                                val (x, y) = find.destructured
                                thisPlayerState.mousePosition.x = x.toInt()
                                thisPlayerState.mousePosition.y = y.toInt()
                                val currentCoordinate: Position = if (thisPlayerState.positions.size > 0) {
                                    calculatePosition(thisPlayerState)
                                } else {
                                    thisPlayerState.mousePosition
                                }
                                updatePositions(thisPlayerState, currentCoordinate)
                                counter.increment()
                            }
                            it.payloadAsText
                        }
                        .then<WebSocketMessage>(Mono.create{
                            updateUserOnClose(thisPlayerState)
                        })
        ).doAfterTerminate{
            updateUserOnClose(thisPlayerState)
        }
    }
}
