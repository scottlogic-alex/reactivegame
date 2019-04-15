package com.scottlogic.reactivegame

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.FluxSink

@Component
class UserNameUpdate {
    var nameSink: FluxSink<NameUpdate>? = null
    val nameChanges = Flux.create<NameUpdate> {
        nameSink = it
    }.publish().autoConnect()
}

data class NameUpdate(
        val userId: String,
        val userName: String
)