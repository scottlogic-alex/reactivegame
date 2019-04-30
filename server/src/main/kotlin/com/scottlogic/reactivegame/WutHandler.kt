package com.scottlogic.reactivegame

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketMessage
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.Disposable
import reactor.core.publisher.*
import java.util.*
import reactor.core.publisher.Flux
import java.time.Duration
import kotlin.collections.ArrayList
import kotlin.concurrent.timerTask
import kotlin.math.pow
import kotlin.random.Random
import kotlin.random.nextUBytes

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
        var hat: String?
)

data class GameState (
        val playerStates: MutableList<PlayerState>,
        var recent: Position,
        var apple: Position?
)

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
    }

    override fun destroy() {
        System.out.println("destroying")
        disposableSubscription?.dispose()
        colourUpdateSubscription?.dispose()
    }

    private val gameState: GameState = GameState(
            playerStates = mutableListOf(),
            recent = Position(x = -100, y = -100),
            apple = null
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
    private var colourUpdateSubscription: Disposable? = null
    private var nameUpdateSubscription: Disposable? = null
    private var disposableSubscription: Disposable? = null
    private var appleDropSubscription: Disposable? = null
    @Autowired
    private lateinit var userRepository: UserRepository
    @Autowired
    private lateinit var userNameUpdate: UserNameUpdate
    @Autowired
    private lateinit var userColourUpdate: UserColourUpdate
    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @ExperimentalUnsignedTypes
    fun getColour(channels: UByteArray): String {
        return "#"+"%02X".repeat(3)
                .format(*channels.map(UByte::toInt).toTypedArray())
    }

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

    fun appleCollect(wormPosition: Position, applePosition: Position): Boolean {
        return (wormPosition.x - (applePosition.x + 35)).toDouble().pow(2) + (wormPosition.y - (applePosition.y + 35)).toDouble().pow(2) < 40.0.pow(2)
    }

    fun waitOneSec(coordinates: List<Position>){
        val timer = Timer()
        timer.schedule(timerTask{
            synchronized(safeDots.collidees) {
                safeDots.collidees.removeAll(coordinates)
            }
        }, 1000)
    }

    fun calculatePosition(thisPlayerState: PlayerState): Position {
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
                if (upper < 2*Math.PI) {
                    compromise = upper - Math.PI
                } else {
                    compromise = upper - 3*Math.PI
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
        if (gameState.apple != null && appleCollect(currentCoordinate, gameState.apple!!)) {
            thisPlayerState.points++
            gameState.apple = null
        }
        sink?.next(Unit)
    }

    @ExperimentalUnsignedTypes
    override fun handle(session: WebSocketSession): Mono<Void> {

        var user: User? = null
        val host: String? = session.handshakeInfo.remoteAddress?.address?.hostName
//        val canonicalHost: String? = session.handshakeInfo.remoteAddress?.address?.canonicalHostName
        if (host !== null) {
            user = userRepository.findByHost(host)
        }

//        println(canonicalHost)
        println(objectMapper.writeValueAsString(user))

        val userId: String
        val username: String
        val colour: String
        var hat: String? = ""

        if (user !== null) {
            userId = user.id
            username = user.name
            colour = user.colour
            if (user.items.size > 0) {
                hat = user.items.filterIsInstance<Hat>().find { hat -> hat.inUse == true }?.name
            }
        } else {
            userId = UUID.randomUUID().toString()
            username = userId
            colour = getColour(Random.nextUBytes(3))
            if (host !== null) {
                userRepository.save(User(userId, username, colour, host, emptyList()))
            }
        }

        val thisPlayerState = PlayerState(
                userId = userId,
                username = username,
                positions = ArrayDeque(),
                colour = colour,
                mousePosition = Position(-1, -1),
                angle = 0.0,
                points = 0,
                hat = hat
        )
        synchronized(gameState.playerStates) {
            gameState.playerStates += thisPlayerState
        }

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
                                var currentCoordinate: Position
                                if (thisPlayerState.positions.size > 0) {
                                    currentCoordinate = calculatePosition(thisPlayerState)
                                }
                                else {
                                    currentCoordinate = thisPlayerState.mousePosition
                                }
                                updatePositions(thisPlayerState, currentCoordinate)
                            }
                            it.payloadAsText
                        }
                        .then<WebSocketMessage>(Mono.create{
                            synchronized(gameState.playerStates) {
                                gameState.playerStates -= thisPlayerState
                                sink?.next(Unit)
                            }
                        })
        ).doAfterTerminate{
            synchronized(gameState.playerStates) {
                gameState.playerStates -= thisPlayerState
                sink?.next(Unit)
            }
        }
    }

}