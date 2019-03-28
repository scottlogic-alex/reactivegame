package com.scottlogic.reactivegame

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.HandlerMapping
import reactor.core.publisher.Mono
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter
import org.springframework.beans.factory.annotation.Autowired




/**
 * https://www.baeldung.com/spring-5-reactive-websockets
 */
@Configuration
class WebSocketHandlers {
    @Autowired
    private lateinit var webSocketHandler: WebSocketHandler

    @Bean
    fun webSocketHandlerMapping(): HandlerMapping {
        val mapping = SimpleUrlHandlerMapping()
        mapping.order = 1
        mapping.urlMap = mapOf<String, WebSocketHandler>("/wut" to webSocketHandler)
        return mapping
    }

    @Bean
    fun handlerAdapter(): WebSocketHandlerAdapter = WebSocketHandlerAdapter()
}