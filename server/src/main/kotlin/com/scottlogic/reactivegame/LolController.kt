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
        val user = userService.getUserByJWT(id)
        if (!user.isPresent) response.statusCode = HttpStatus.NOT_FOUND
        return user
    }

    @GetMapping("/validate")
    fun findIfUserExistsById(@CookieValue(value = "id", defaultValue = "")id: String): Boolean {
        return userService.getUserByJWT(id).isPresent
    }

    @PutMapping("/id/colour")
    fun updateColourById (@RequestBody colour: String, @CookieValue(value = "id", defaultValue = "") id: String) {
        val user = userService.getUserByJWT(id)
        userColourUpdate.colourSink?.next(ColourUpdate(userId = user.get().id, colour = colour))
        return userRepository.updateUserSetColourById(colour = colour, id = user.get().id)
    }

    @PutMapping("/id/name")
    fun updateUsernameById(@RequestBody username: String, @CookieValue(value = "id", defaultValue = "") id: String) {
        val user = userService.getUserByJWT(id)
        userNameUpdate.nameSink?.next(NameUpdate(userName = username.trim(), userId = user.get().id))
        return userRepository.updateUserSetUsernameById(username = username, id = user.get().id)
    }

    @PutMapping("/id/hats")
    fun setItemInUse(@RequestBody hatId: String,  @CookieValue(value = "id", defaultValue = "") id: String) {
        val user = userService.getUserByJWT(id).get()
        user.items.filterIsInstance<Hat>().forEach { it.inUse = false }
        if (hatId != "noHat") {
            user.items.filterIsInstance<Hat>().find { it.id == hatId }?.inUse = true
        }
        userRepository.save(user)
    }

    @PutMapping("/id/user")
    fun updateUser(@RequestBody saveObject: SaveObject, @CookieValue(value = "id", defaultValue = "") id: String) {
        val user = userService.getUserByJWT(id).get()
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
        val userSearch: Optional<User> = userRepository.findByEmail(email)
        val user: User
        if (userSearch.isPresent) {
            user = userSearch.get()
            val validToken: Optional<Token> = tokenRepository.selectTokenByUser(user.id)
            if (validToken.isPresent) return false
        } else {
            user = userService.createNewUser(email)
        }
        val token = Token()
        token.user = user
        val savedToken = tokenRepository.save(token)
        val host: String? = request.headers.host?.hostString
        emailService.sendEmail(email, host, savedToken.id!!)
        return true
    }

    @GetMapping("/host/hostname")
    fun getHostname(request: ServerHttpRequest): String? {
        return request.remoteAddress?.hostName
    }
}
