package com.scottlogic.reactivegame

import io.netty.channel.ChannelOption
import io.netty.handler.timeout.ReadTimeoutHandler
import io.netty.handler.timeout.WriteTimeoutHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory
import org.springframework.boot.web.embedded.netty.NettyServerCustomizer
import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.HandlerMapping
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter
import reactor.netty.http.server.HttpServer
import reactor.netty.tcp.TcpServer
import org.springframework.web.cors.reactive.CorsWebFilter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource


/**
 * https://www.baeldung.com/spring-5-reactive-websockets
 */
@Configuration
class WebSocketHandlers {
    @Autowired
    private lateinit var wutHandler: WutHandler

    @Bean
    fun webSocketHandlerMapping(): HandlerMapping {
        val mapping = SimpleUrlHandlerMapping()
        mapping.order = 1
        mapping.urlMap = mapOf<String, WebSocketHandler>("/wut" to wutHandler)
        return mapping
    }

//    @Bean
//    fun webSocketService(): WebSocketService {
//        val strategy = TomcatRequestUpgradeStrategy()
//        strategy.setMaxSessionIdleTimeout(10000L)
//        return HandshakeWebSocketService(strategy)
//    }

    @Bean
    fun handlerAdapter(): WebSocketHandlerAdapter = WebSocketHandlerAdapter()

    @Bean
    fun corsWebFilter(): CorsWebFilter {
        val corsConfig = CorsConfiguration()
        corsConfig.allowedOrigins = listOf("*")
        corsConfig.maxAge = 8000L
        corsConfig.allowedMethods = listOf("OPTIONS", "GET", "PUT", "POST", "DELETE")
        corsConfig.allowedHeaders = listOf("X-Requested-With", "Origin", "Content-Type", "Accept", "Authorization")
        corsConfig.allowCredentials = true

        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", corsConfig)

        return CorsWebFilter(source)
    }


    @Bean
    fun serverFactoryCustomizer(): WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {
        return NettyTimeoutCustomizer()
    }


}

class NettyTimeoutCustomizer: WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {

    override fun customize(factory: NettyReactiveWebServerFactory) {
        val connectionTimeout = 1
        val readtimeout = 3000
        factory.addServerCustomizers(NettyServerCustomizer
                {server: HttpServer -> server.tcpConfiguration{
                tcp: TcpServer -> tcp.option(ChannelOption.CONNECT_TIMEOUT_MILLIS,connectionTimeout)
                .doOnConnection{ connection -> connection.addHandlerLast(ReadTimeoutHandler(readtimeout))}}})
//        factory.addServerCustomizers(arrayOf<>({server -> server.tcpConfiguration()}))
    }
}