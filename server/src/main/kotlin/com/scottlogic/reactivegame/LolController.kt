package com.scottlogic.reactivegame

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.web.servlet.server.Session
import org.springframework.http.ResponseCookie
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.time.Duration
import java.util.*
import javax.transaction.Transactional
import javax.xml.ws.Response
import kotlin.random.Random
import kotlin.random.nextUBytes

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
    private lateinit var hatRepository: HatRepository

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

    @ExperimentalUnsignedTypes
    private fun getColour(channels: UByteArray): String {
        return "#"+"%02X".repeat(3)
                .format(*channels.map(UByte::toInt).toTypedArray())
    }

    @GetMapping("/id")
    @ExperimentalUnsignedTypes
    fun getUserByIdUsingCookie(@CookieValue(value = "id", defaultValue = "") id: String, response: ServerHttpResponse): Optional<User> {
        println(id)
        if (id == "") {
            val user = User(
//                    id = UUID.randomUUID().toString(),
                    id = "",
                    name = "new user",
                    colour = getColour(Random.nextUBytes(3)),
                    items = listOf(),
                    host = UUID.randomUUID().toString()
            )
            val savedUser = userRepository.save(user)
            response.addCookie(ResponseCookie.from("id", savedUser.id).path("/").build())
            return Optional.of(savedUser)
        }
        return userRepository.findById(id)
    }



    @PostMapping("/")
    fun addUser(user: User): User {
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
        if (username.length <= 30) {
            val user = userRepository.findByHost(request.remoteAddress!!.hostName)
            userNameUpdate.nameSink?.next(NameUpdate(userName = username.trim(), userId = user!!.id))
            return userRepository.updateUserSetUsernameForHost(username, request.remoteAddress!!.hostName)
        }
    }

    @PutMapping("/host/hats")
    fun setItemInUse(@RequestBody hatId: String, request: ServerHttpRequest) {
        println(hatId)
        val user = userRepository.findByHost(request.remoteAddress!!.hostName)
        println(user)
        user?.items?.filterIsInstance<Hat>()?.forEach { it.inUse = false }
        if (hatId != "noHat") {
            user?.items?.filterIsInstance<Hat>()?.find { it.id == hatId }?.inUse = true
        }
        userRepository.save(user!!)
//        hatRepository.setUserHatsNotInUse(user!!.id)
//        hatRepository.setInUseTrueById(hatId)
    }

    @GetMapping("/host/hostname")
    fun getHostname(request: ServerHttpRequest): String? {
        return request.remoteAddress?.hostName
    }
}
