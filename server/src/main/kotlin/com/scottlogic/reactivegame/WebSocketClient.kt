package com.scottlogic.reactivegame

import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient
import reactor.core.publisher.Mono
import java.net.URI
import java.time.Duration


object ReactiveJavaClientWebSocket {

    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {

        val client = ReactorNettyWebSocketClient()
        client.execute(
                URI.create("ws://localhost:8080/wut")
        ) { session ->
            session.send(
                    Mono.just(session.textMessage("event-spring-reactive-client-websocket")))
                    .thenMany(session.receive()
                            .map<String>{ it.payloadAsText }
                            .log())
                    .then()
        }
                .block(Duration.ofSeconds(10L))
    }
}