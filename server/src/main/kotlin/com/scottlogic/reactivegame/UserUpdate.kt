package com.scottlogic.reactivegame

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.FluxSink

@Component
class UserUpdate {

    var updateSink: FluxSink<ColourUpdate>? = null
    val userChanges = Flux.create<ColourUpdate> {
        updateSink = it
    }.publish().autoConnect()

}

data class ColourUpdate(
        val userId: String,
        val colour: String
)