package com.scottlogic.reactivegame

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
        val username: String,
        val userId: String,
        val positions: ArrayDeque<Position>,
        var colour: String,
        val mousePosition: Position,
        var angle: Double
)

 data class GameState (
         val playerStates: MutableList<PlayerState>,
         var recent: Position?
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

        colourUpdateSubscription = userUpdate.userChanges.subscribe{
            val player = gameState.playerStates.find { player -> player.userId == it.userId }
            if (player != null) player.colour = it.colour
            sink?.next(Unit)
        }
    }

    override fun destroy() {
        System.out.println("destroying")
        disposableSubscription?.dispose()
        colourUpdateSubscription?.dispose()
    }

    private val gameState: GameState = GameState(playerStates = mutableListOf(), recent = null)
    private val safeDots: Collisions = Collisions(collidees = ArrayList())
    private val coordRegex: Regex = Regex("X: (\\d+), Y: (\\d+)")
    private var sink: FluxSink<Unit>? = null
    private val gameChanges = Flux.create<Unit>{
        sink = it
        it.next(Unit)
    }.publish().autoConnect() //.share()
    private val physicsUpdate = Flux.interval(Duration.ofMillis(100L)).publish().autoConnect()
    private var colourUpdateSubscription: Disposable? = null

    private var disposableSubscription: Disposable? = null
    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var userUpdate: UserUpdate

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

    fun waitOneSec(coordinates: List<Position>){
        val timer = Timer()
//        System.out.println(safeDots.collidees)
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
//        System.out.println("${current}, ${intended}, ${upper}, ${lower}, ${compromise}")

        thisPlayerState.angle = compromise
        val maxMovement = 20
        val x = oldPosition.x + (Math.cos(compromise) * maxMovement)
        val y = oldPosition.y + (Math.sin(compromise) * maxMovement)
        return Position(x.toInt(), y.toInt())
    }

    fun updatePositions(thisPlayerState: PlayerState, currentCoordinate: Position) {
//        if (!collideWithSelf(currentCoordinate, thisPlayerState.positions)) {
            if (thisPlayerState.positions.size >= 10) thisPlayerState.positions.pop()
            thisPlayerState.positions.addLast(currentCoordinate)
            val obstacles = arrayListOf<Position>()
            gameState.recent = null
            synchronized(gameState.playerStates){
                gameState.playerStates.forEach { user -> if (user.username !== thisPlayerState.username) obstacles.addAll(user.positions) }
            }
            val collisions = obstacles.filter { position -> collision(position, currentCoordinate) }
            if (collisions.isNotEmpty()) {
                synchronized(safeDots.collidees) {
                    safeDots.collidees.addAll(collisions)
                }
                waitOneSec(collisions)
                gameState.recent = currentCoordinate
            }
            sink?.next(Unit)
//        }
    }
//
//    fun collideWithSelf(calculatedPosition: Position, previousPositions: ArrayDeque<Position>): Boolean {
//        if (previousPositions.size <= 1) return false
////        previousPositions.removeLast()
//        return previousPositions.find{position ->
//            (position.x - calculatedPosition.x).toDouble().pow(2) + (position.y - calculatedPosition.y).toDouble().pow(2) <= 19.0.pow(2)
//        } !== null
//    }


    @ExperimentalUnsignedTypes
    override fun handle(session: WebSocketSession): Mono<Void> {

        var user: User? = null
        var host: String? = session.handshakeInfo.remoteAddress?.address?.hostName
        if (host !== null) {
            user = userRepository.findByHost(host)
        }

        println(user)

        var userId: String
        var username: String
        var colour: String

        if (user !== null) {
            userId = user.id
            username = user.name
            colour = user.colour
        } else {
            userId = UUID.randomUUID().toString()
            username = userId
            colour = getColour(Random.nextUBytes(3))
            if (host !== null) {

                userRepository.save(User(userId, username, colour, host))
            }
        }

        val thisPlayerState = PlayerState(
                userId = userId,
                username = username,
                positions = ArrayDeque(), //Position(0, 0),
                colour = colour,
                mousePosition = Position(-1, -1),
                angle = 0.0
        )
        synchronized(gameState.playerStates) {
            gameState.playerStates += thisPlayerState
        }

//session.handshakeInfo.remoteAddress.address.hostName


        sink?.next(Unit)

        return session.send(
                gameChanges
                        .map {
                            synchronized(gameState.playerStates) {
                                gameState.playerStates.joinToString(":") { player ->
                                    "${player.username}, ${player.colour}, " +
                                            player.positions.joinToString("_") { position -> "${position.x},${position.y}" }
                                } + "/${gameState.recent?.x ?: -100}, ${gameState.recent?.y ?: -100}"
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
//                                System.out.println(calculatePosition(currentCoordinate, thisPlayerState.positions.last))
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