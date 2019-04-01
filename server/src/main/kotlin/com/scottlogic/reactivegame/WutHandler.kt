package com.scottlogic.reactivegame

import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Flux.interval
import reactor.core.publisher.Mono
import java.time.Duration
import java.util.*

data class Position (
        var x: Int,
        var y: Int
)

data class PlayerState(
        val username: String,
        var position: Position
)

 data class GameState (
         val playerStates: MutableList<PlayerState>
 )

@Component
class WutHandler: WebSocketHandler {
    val gameState: GameState = GameState(mutableListOf())
    val coordRegex: Regex = Regex("X: (\\d+), Y: (\\d+)")
    val sessions: MutableList<WebSocketSession> = mutableListOf()



    override fun handle(session: WebSocketSession): Mono<Void> {
        val thisPlayerState: PlayerState = PlayerState(
                username = UUID.randomUUID().toString(),
                position = Position(0, 0)
        )
        gameState.playerStates += thisPlayerState
        sessions += session

        return session.send(
                interval(Duration.ofMillis(10L)).map{ session.textMessage(
                        gameState.playerStates.joinToString(":") { player -> "${player.username}, ${player.position.x}, ${player.position.y}"}
                )}
        ).and(
                session.receive()
                        .map {
                            val find = coordRegex.find(it.payloadAsText)
                            if (find != null) {
                                val (x, y) = find.destructured
                                thisPlayerState.position.x = x.toInt()
                                thisPlayerState.position.y = y.toInt()
                            }
                            it.payloadAsText
                        }
                        .log()
                        .all { true }
                        .then<Boolean>(Mono.create{
                            gameState.playerStates -= thisPlayerState
                        })
        )
    }
}