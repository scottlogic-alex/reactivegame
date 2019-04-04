package com.scottlogic.reactivegame

import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketMessage
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.*
import java.util.*
import reactor.core.publisher.Flux
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
        var positions: ArrayDeque<Position>,
        val colourBytes: UByteArray
)

 data class GameState (
         val playerStates: MutableList<PlayerState>,
         var recent: Position?
 )


@Component
class WutHandler: WebSocketHandler/*, InitializingBean*/ {
    val gameState: GameState = GameState(playerStates = mutableListOf(), recent = null)
    var safeDots: Collisions = Collisions(collidees = ArrayList())
    val coordRegex: Regex = Regex("X: (\\d+), Y: (\\d+)")
    var sink: FluxSink<Unit>? = null
//    val sink = EmitterProcessor.create<Unit>().sink()
    val gameChanges = Flux.create<Unit>{
        sink = it
        it.next(Unit)
    }.publish().autoConnect() //.share()


    @ExperimentalUnsignedTypes
    fun getColour(channels: UByteArray): String {
        return "#"+"%02X".repeat(3)
                .format(*channels.map(UByte::toInt).toTypedArray())
    }

    fun collision(existing: Position, toDraw: Position): Boolean {
        if (safeDots.collidees.find{position -> (position.x === existing.x && position.y === existing.y) } === null) {
            return (
                    (existing.x - toDraw.x).toDouble().pow(2) + (existing.y - toDraw.y).toDouble().pow(2) < 20.0.pow(2)
                    )
        }
        return false
    }

    fun waitOneSec(coordinates: List<Position>){
        val timer = Timer()
        System.out.println(safeDots.collidees)
        timer.schedule(timerTask{
            safeDots.collidees.removeAll(coordinates)
        }, 1000)
    }

    @ExperimentalUnsignedTypes
    override fun handle(session: WebSocketSession): Mono<Void> {
        val thisPlayerState = PlayerState(
                username = UUID.randomUUID().toString(),
                positions = ArrayDeque(), //Position(0, 0),
                colourBytes = Random.nextUBytes(3)
        )
        gameState.playerStates += thisPlayerState

        sink?.next(Unit)

        return session.send(
                gameChanges
                        .map { gameState.playerStates.joinToString(":") { player ->
                            "${player.username}, ${getColour(player.colourBytes)}, " +
                                    player.positions.joinToString("_") { position -> "${position.x},${position.y}" }
                        } + "/${gameState.recent?.x ?: -100}, ${gameState.recent?.y ?: -100}"}
                        .log()
                        .map(session::textMessage)
        ).and(
                session.receive()
                        .map {
                            val find = coordRegex.find(it.payloadAsText)
                            if (find != null) {
                                val (x, y) = find.destructured
                                val currentCoordinate = Position(x.toInt(), y.toInt())
                                if (thisPlayerState.positions.size >= 10) thisPlayerState.positions.pop()
                                thisPlayerState.positions.addLast(currentCoordinate)
                                val obstacles = arrayListOf<Position>()
                                gameState.recent = null
                                gameState.playerStates.forEach{user -> if (user.username !== thisPlayerState.username) obstacles.addAll(user.positions)}
                                val collisions = obstacles.filter{position -> collision(position, currentCoordinate) }
                                if (collisions.isNotEmpty()) {
                                    safeDots.collidees.addAll(collisions)
                                    waitOneSec(collisions)
                                    gameState.recent = Position(x.toInt(), y.toInt())
                                }
                                sink?.next(Unit)
                            }
                            it.payloadAsText
                        }
                        .then<WebSocketMessage>(Mono.create{
                            gameState.playerStates -= thisPlayerState
                            sink?.next(Unit)
                        })
        )
    }

}