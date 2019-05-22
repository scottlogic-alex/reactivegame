package com.scottlogic.reactivegame

import com.scottlogic.reactivegame.services.EmailService
import com.scottlogic.reactivegame.services.JsonWebTokenService
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
    private lateinit var tokenRepository: TokenRepository

    @Autowired
    private lateinit var userColourUpdate: UserColourUpdate

    @Autowired
    private lateinit var userNameUpdate: UserNameUpdate

    @Autowired
    private lateinit var emailService: EmailService

    @Autowired
    private lateinit var jwtservice: JsonWebTokenService

    @GetMapping("/id")
    fun getUserByIdUsingCookie(
            @CookieValue(value = "id", defaultValue = "") id: String, response: ServerHttpResponse): Optional<User> {
        if (id != "") {
        val valid: Boolean = jwtservice.validateToken(id)
            if (valid) {
                val userId = jwtservice.getUserIdFromJWT(id)
                if (userId != null) {
                    val user = userRepository.findById(userId)
                    if (user.isPresent) return user
                }
            }
        }
        response.statusCode = HttpStatus.NOT_FOUND
        return Optional.empty()
    }

    @GetMapping("/validate")
    fun findIfUserExistsById(@CookieValue(value = "id", defaultValue = "")id: String): Boolean {
        val valid: Boolean = jwtservice.validateToken(id)
        if (valid) {
            val userId = jwtservice.getUserIdFromJWT(id)
            var user: Optional<User> = Optional.empty()
            if (userId != null) {
                user = userRepository.findById(userId)
            }
            return user.isPresent
        }
        return false
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
    fun login(@PathVariable("token_id") tokenId: String, response: ServerHttpResponse, request: ServerHttpRequest) {
        val tokenOptional: Optional<Token> = tokenRepository.findById(tokenId)
        val host = request.headers.host?.hostString ?: "localhost"
        if (tokenOptional.isPresent) {
            val token = tokenOptional.get()
            if (token.expiry_time > Instant.now()) {
                response.statusCode = HttpStatus.FOUND
                response.headers.location = URI("http://$host:3000/home")
                val cookie = jwtservice.generateToken(token.user!!.id)
                response.addCookie(ResponseCookie.from("id", cookie).domain(host).path("/").build())
                return
            }
        }
        response.statusCode = HttpStatus.FOUND
        response.headers.location = URI("http://$host:3000/register")
        return
    }

    @PostMapping("/requestLink")
    fun requestLink(@RequestBody emailPrefix: String, response: ServerHttpResponse, request: ServerHttpRequest): Boolean {
        if (!emailService.whitelist.contains(emailPrefix.toLowerCase())) return false
        val email = "${emailPrefix.toLowerCase()}@scottlogic.com"
        val user = userRepository.findByEmail(email)
        if (user != null) {
            val existingToken: Optional<Token> = tokenRepository.selectTokenByUser(user.id)
            if (existingToken.isPresent) return false
        }
        var token = Token()
        if (user != null) {
            token.user = user
        } else {
            val newUser = userService.createNewUser(email)
            token.user = newUser
        }
        val savedToken = tokenRepository.save(token)
        val host = request.headers.host?.hostString ?: "localhost"
        val body = "Welcome to Worm World!\n\nHere is your link to get started http://$host:8080/lol/login/token/${savedToken.id}\n\nSee you there!"
        emailService.sendEmail(email, body)
        return true
    }

    @GetMapping("/host/hostname")
    fun getHostname(request: ServerHttpRequest): String? {
        return request.remoteAddress?.hostName
    }
}
