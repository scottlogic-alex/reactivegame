package com.scottlogic.reactivegame

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import javax.transaction.Transactional

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
    private lateinit var userColourUpdate: UserColourUpdate

    @Autowired
    private lateinit var userNameUpdate: UserNameUpdate

    @Transactional
    @GetMapping("/name/{name}")
    fun getUserByName(@PathVariable name: String): User? {
        return userRepository.findByName(name)
    }

    @Transactional
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
        userColourUpdate.colourSink?.next(ColourUpdate(colour = colour,  userId = user!!.id))
        return userRepository.updateUserSetColourForHost(colour, request.remoteAddress!!.hostName)
    }

    @PutMapping("/host/name")
    fun updateUsernameByHost(@RequestBody username: String, request: ServerHttpRequest) {
        val user = userRepository.findByHost(request.remoteAddress!!.hostName)
        userNameUpdate.nameSink?.next(NameUpdate(userName = username, userId = user!!.id))
        return userRepository.updateUserSetUsernameForHost(username, request.remoteAddress!!.hostName)
    }

}
