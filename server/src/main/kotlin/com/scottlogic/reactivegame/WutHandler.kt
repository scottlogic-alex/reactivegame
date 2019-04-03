package com.scottlogic.reactivegame

import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketMessage
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.*
import java.util.*
import reactor.core.publisher.Flux
import kotlin.random.Random
import kotlin.random.nextUBytes


data class Position (
        var x: Int,
        var y: Int
)

data class PlayerState @ExperimentalUnsignedTypes constructor(
        val username: String,
        var position: Position,
        val colourBytes: UByteArray
)

 data class GameState (
         val playerStates: MutableList<PlayerState>
 )

@Component
class WutHandler: WebSocketHandler/*, InitializingBean*/ {
    val gameState: GameState = GameState(mutableListOf())
    val coordRegex: Regex = Regex("X: (\\d+), Y: (\\d+)")
    var sink: FluxSink<Unit>? = null
//    val sink = EmitterProcessor.create<Unit>().sink()
    val gameChanges = Flux.create<Unit>{ sink = it }.publish().autoConnect() //.share()


    @ExperimentalUnsignedTypes
    fun getColour(channels: UByteArray): String {
        return "#"+"%02X".repeat(3)
                .format(*channels.map(UByte::toInt).toTypedArray())
    }

    @ExperimentalUnsignedTypes
    override fun handle(session: WebSocketSession): Mono<Void> {
        val thisPlayerState = PlayerState(
                username = UUID.randomUUID().toString(),
                position = Position(0, 0),
                colourBytes = Random.nextUBytes(3)
        )
        gameState.playerStates += thisPlayerState



        sink?.next(Unit)

        return session.send(
                gameChanges
                        .map { gameState.playerStates.joinToString(":") { player -> "${player.username}" +
                                ", ${getColour(player.colourBytes)}" +
                                ", ${player.position.x}, ${player.position.y}" } }
                        .log()
                        .map(session::textMessage)
        ).and(
                session.receive()
                        .map {
                            val find = coordRegex.find(it.payloadAsText)
                            if (find != null) {
                                val (x, y) = find.destructured
                                thisPlayerState.position.x = x.toInt()
                                thisPlayerState.position.y = y.toInt()
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