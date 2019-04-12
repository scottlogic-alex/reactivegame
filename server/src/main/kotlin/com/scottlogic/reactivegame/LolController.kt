package com.scottlogic.reactivegame

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.server.ServerHttpRequest
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

    @GetMapping("/name/{name}")
    fun getUserByName(@PathVariable name: String): User? {
        return userRepository.findByName(name)
    }

    @GetMapping("/host")
    fun getUserByHost(request: ServerHttpRequest): User? {
        return userRepository.findByHost(request.remoteAddress.hostName)
    }

    @PostMapping("/")
    fun addUser(user: User) {
        return userRepository.save(user)
    }

}