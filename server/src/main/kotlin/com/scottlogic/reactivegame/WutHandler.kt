package com.scottlogic.reactivegame

import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

//data class Wut(
//        val wut: String
//)

 data class GameState (
         var x: Int,
         var y: Int
 )

@Component
class WutHandler: WebSocketHandler {
    val gameState: GameState = GameState(0, 0)
    val coordRegex: Regex = Regex("X: (\\d+), Y: (\\d+)")

    override fun handle(session: WebSocketSession): Mono<Void> {
        return session.send(
                Flux.interval(
                        Duration.ofSeconds(1))
                        .map{ session.textMessage("${gameState.x}, ${gameState.y}") })
                .and(
                        session.receive()
                                .map{
                                    val find = coordRegex.find(it.payloadAsText)
                                    if (find != null) {
                                        val (x, y) = find.destructured
                                        gameState.x = x.toInt()
                                        gameState.y = y.toInt()
                                    }
                                    it.payloadAsText
                                }
                                .log())
    }

}