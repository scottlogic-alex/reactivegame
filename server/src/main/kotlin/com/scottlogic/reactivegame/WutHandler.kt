package com.scottlogic.reactivegame

import org.reactivestreams.Publisher
import org.springframework.stereotype.Component
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketMessage
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.*
import java.util.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Flux.interval
//import reactor.core.publisher.FluxCreate.*
import java.time.Duration


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
class WutHandler: WebSocketHandler/*, InitializingBean*/ {
    val gameState: GameState = GameState(mutableListOf())
    val coordRegex: Regex = Regex("X: (\\d+), Y: (\\d+)")
    var sink: FluxSink<Unit>? = null
//    val sink = EmitterProcessor.create<Unit>().sink()
    val gameChanges = Flux.create<Unit>{ sink = it }.publish().autoConnect() //.share()

//    val sessions: MutableList<WebSocketSession> = mutableListOf()


//    override fun afterPropertiesSet() {
//        gameChangesSubject.subscribe()
//    }

//    @Bean(initMethod = "init")
//    fun wutHandler(): WutHandler {
//        return WutHandler()
//    }

//    val a = interval(Duration.ofSeconds(1L)).share().log()
//    val b = interval(Duration.ofSeconds(1L)).publish().autoConnect().log()

    override fun handle(session: WebSocketSession): Mono<Void> {
//        a.subscribe()
//        val subscription = a.subscribe()

        val thisPlayerState = PlayerState(
                username = UUID.randomUUID().toString(),
                position = Position(0, 0)
        )
        gameState.playerStates += thisPlayerState



        sink?.next(Unit)
//        sessions += session

        return session.send(
                // on update of subject instead of interval
                gameChanges
//                Flux.from(gameChanges)
                        .map { gameState.playerStates.joinToString(":") { player -> "${player.username}, ${player.position.x}, ${player.position.y}" } }
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
                                // send void to subject
//                                afterPropertiesSet()
                                sink?.next(Unit)
                            }
                            it.payloadAsText
                        }
//                        .log()
//                        .
//                        .all { true }
                        .then<WebSocketMessage>(Mono.create{
                            gameState.playerStates -= thisPlayerState
//                            subscription.dispose()
                            sink?.next(Unit)
                        })
        )
    }

}