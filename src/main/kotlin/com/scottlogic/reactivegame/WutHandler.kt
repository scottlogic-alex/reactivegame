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

@Component
class WutHandler: WebSocketHandler {
    override fun handle(session: WebSocketSession): Mono<Void> {
        return session.send(
                Flux.interval(
                        Duration.ofSeconds(1))
                        .map{ session.textMessage("lol $it") })
                .and(
                        session.receive()
                                .map{ it.payloadAsText })
                .log()
    }

}