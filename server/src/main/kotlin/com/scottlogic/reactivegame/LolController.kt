package com.scottlogic.reactivegame

import com.scottlogic.reactivegame.services.EmailService
import com.scottlogic.reactivegame.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseCookie
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.net.URI
import java.time.Instant
import java.util.*
import kotlin.random.Random
import kotlin.random.nextUBytes

data class Lol(
        val lol: String
)

data class SaveObject(
        val colour: String,
        val username: String,
        val hatId: String
)

@RestController
@RequestMapping("/lol")
class LolController {
    @GetMapping
    fun getLol(): Mono<Lol> = Mono.just(Lol("lol"))

    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var userService: UserService

    @Autowired
    private lateinit var hatRepository: HatRepository

    @Autowired
    private lateinit var tokenRepository: TokenRepository

    @Autowired
    private lateinit var userColourUpdate: UserColourUpdate

    @Autowired
    private lateinit var userNameUpdate: UserNameUpdate

    @Autowired
    private lateinit var emailService: EmailService

    @ExperimentalUnsignedTypes
    private fun getColour(channels: UByteArray): String {
        return "#"+"%02X".repeat(3)
                .format(*channels.map(UByte::toInt).toTypedArray())
    }

    @GetMapping("/id")
    @ExperimentalUnsignedTypes
    fun getUserByIdUsingCookie(
            @CookieValue(value = "id", defaultValue = "") id: String,
            response: ServerHttpResponse,
            request: ServerHttpRequest): Optional<User> {
            val savedUser = userService.ensureUserExists(id)
            if (id == "") response.addCookie(ResponseCookie.from("id", savedUser.get().id).path("/").build())
        return savedUser
    }

    @PutMapping("/id/colour")
    fun updateColourById (@RequestBody colour: String, @CookieValue(value = "id", defaultValue = "") id: String) {
        userColourUpdate.colourSink?.next(ColourUpdate(userId = id, colour = colour))
        return userRepository.updateUserSetColourById(colour = colour, id = id)
    }

    @PutMapping("/id/name")
    fun updateUsernameById(@RequestBody username: String, @CookieValue(value = "id", defaultValue = "") id: String) {
        userNameUpdate.nameSink?.next(NameUpdate(userName = username.trim(), userId = id))
        return userRepository.updateUserSetUsernameById(username = username, id = id)
    }

    @PutMapping("/id/hats")
    fun setItemInUse(@RequestBody hatId: String,  @CookieValue(value = "id", defaultValue = "") id: String) {
        val user = userRepository.findById(id).get()
        user.items.filterIsInstance<Hat>().forEach { it.inUse = false }
        if (hatId != "noHat") {
            user.items.filterIsInstance<Hat>().find { it.id == hatId }?.inUse = true
        }
        userRepository.save(user)
    }

    @PutMapping("/id/user")
    fun updateUser(@RequestBody saveObject: SaveObject, @CookieValue(value = "id", defaultValue = "") id: String) {
        val user: User = userRepository.findById(id).get()
        user.items.filterIsInstance<Hat>().forEach { it.inUse = false }
        if (saveObject.hatId != "noHat") {
            user.items.filterIsInstance<Hat>().find { it.id == saveObject.hatId }?.inUse = true
        }
        user.colour = saveObject.colour
        user.name = saveObject.username
        userRepository.save(user)
    }

    @GetMapping("/highscores")
    fun getHighScores(): Iterable<User> {
        return userRepository.findAll().filter { user -> user.high_score > 0 }
    }

    @GetMapping("/login/token/{token_id}")
    fun login(@PathVariable("token_id") tokenId: String, response: ServerHttpResponse) {
        val tokenOptional: Optional<Token> = tokenRepository.findById(tokenId)
        if (tokenOptional.isPresent) {
            val token = tokenOptional.get()
            if (token.expiry_time > Instant.now()) {
                response.statusCode = HttpStatus.FOUND
                response.headers.location = URI("http://ws00100:3000/")
                return
            }
        }
        response.headers.location = URI("http://ws00100:3000/register")
    }

    @PostMapping("/requestLink")
    fun requestLink(@RequestBody email: String) {
//        emailService.sendEmail(email)
        println(email)
    }

    @GetMapping("/host/hostname")
    fun getHostname(request: ServerHttpRequest): String? {
        return request.remoteAddress?.hostName
    }
}
