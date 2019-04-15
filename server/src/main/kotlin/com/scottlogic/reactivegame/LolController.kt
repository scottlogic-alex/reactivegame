package com.scottlogic.reactivegame

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

data class Lol(
        val lol: String
)

@RestController
@RequestMapping("/lol")
class LolController {
    @GetMapping
    fun getLol(): Mono<Lol> = Mono.just(Lol("lol"))

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var userUpdate: UserUpdate

    @GetMapping("/name/{name}")
    fun getUserByName(@PathVariable name: String): User? {
        return userRepository.findByName(name)
    }

    @GetMapping("/host")
    fun getUserByHost(request: ServerHttpRequest): User? {
        return userRepository.findByHost(request.remoteAddress!!.hostName)
    }

    @PostMapping("/")
    fun addUser(user: User) {
        return userRepository.save(user)
    }

    @PutMapping("/host/colour")
    fun updateColourByHost(@RequestBody colour: String, request: ServerHttpRequest) {
        val user = userRepository.findByHost(request.remoteAddress!!.hostName)
        userUpdate.updateSink?.next(ColourUpdate(colour = colour,  userId = user!!.id))
        return userRepository.updateUserSetColourForHost(colour, request.remoteAddress!!.hostName)
    }

    @PutMapping("/host/name")
    fun updateUsernameByHost(@RequestBody username: String, request: ServerHttpRequest) {
        return userRepository.updateUserSetUsernameForHost(username, request.remoteAddress!!.hostName)
    }

}
