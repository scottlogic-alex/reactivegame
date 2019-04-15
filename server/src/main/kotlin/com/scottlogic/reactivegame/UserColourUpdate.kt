package com.scottlogic.reactivegame

import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.FluxSink

@Component
class UserColourUpdate {
    var colourSink: FluxSink<ColourUpdate>? = null
    val colourChanges = Flux.create<ColourUpdate> {
        colourSink = it
    }.publish().autoConnect()
}

data class ColourUpdate(
        val userId: String,
        val colour: String
)