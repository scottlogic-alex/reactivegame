package com.scottlogic.reactivegame

import com.scottlogic.reactivegame.services.EmailService
import com.scottlogic.reactivegame.services.JsonWebTokenService
import com.scottlogic.reactivegame.services.UserService
import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseCookie
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import java.net.URI
import java.util.*
import java.util.function.Function

@Component
class LoginCounter(val registry: MeterRegistry) {
    val coolMap: MutableMap<String, Counter> = mutableMapOf()
}

data class Lol(
        val lol: String
)

data class SaveObject(
        val colour: String,
        val username: String,
        val hatId: String
)

enum class Messages {
    INVALID_REQUEST, TOKEN_EXISTS, NEW_TOKEN, NEW_USER
}

data class MessageObject(
        var payload: Messages
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

//    @Autowired
//    private lateinit var registry: MeterRegistry

    @Autowired
    private lateinit var loginCounter: LoginCounter

    @GetMapping("/id")
    fun getUserByIdUsingCookie(
            @CookieValue(value = "id", defaultValue = "") id: String, response: ServerHttpResponse): Optional<User> {
        val user = userService.getUserByJWT(id)
        if (user.isPresent)  {
            val counter = loginCounter.coolMap.computeIfAbsent(user.get().id) { loginCounter.registry.counter("test", "user", user.get().email.removeSuffix("@scottlogic.com") ) }
            counter.increment()
        } else {
            response.statusCode = HttpStatus.NOT_FOUND
        }
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

    @PutMapping("/id/user")
    fun updateUser(@RequestBody saveObject: SaveObject, @CookieValue(value = "id", defaultValue = "") id: String) {
        val user = userService.getUserByJWT(id).get()
        userService.updateUser(user, saveObject.hatId, saveObject.colour, saveObject.username)
    }

    @GetMapping("/highscores")
    fun getHighScores(): Iterable<User> {
        return userRepository.findAll().filter { user -> user.high_score > 0 }
    }

    @GetMapping("/login/token/{token_id}")
    fun login(@PathVariable("token_id") tokenId: String, response: ServerHttpResponse, request: ServerHttpRequest) {
        val tokenOptional: Optional<Token> = tokenRepository.selectTokenById(tokenId)
        val host = request.headers.host?.hostString ?: "localhost"
        if (tokenOptional.isPresent) {
            val token: Token = tokenOptional.get()
                response.statusCode = HttpStatus.FOUND
                response.headers.location = URI("http://$host:3000/home")
                val cookie = jwtservice.generateCookieToken(token.user!!.id)
                response.addCookie(ResponseCookie.from("id", cookie).domain(host).path("/").build())
                return
        }
        response.statusCode = HttpStatus.TEMPORARY_REDIRECT
        response.headers.location = URI("http://$host:3000/register")
        return
    }

    @PostMapping("/requestLink")
    fun requestLink(@RequestBody emailPrefix: String, response: ServerHttpResponse, request: ServerHttpRequest): MessageObject {
        if (!emailService.whitelist.contains(emailPrefix.toLowerCase())) return MessageObject(payload = Messages.INVALID_REQUEST)
        val email = "${emailPrefix.toLowerCase()}@scottlogic.com"
        val userSearch: Optional<User> = userRepository.findByEmail(email)
        val user: User
        var returnMessage = MessageObject(payload = Messages.NEW_TOKEN)
        if (userSearch.isPresent) {
            user = userSearch.get()
            if(tokenRepository.selectTokenByUser(user.id).isPresent) return MessageObject(payload = Messages.TOKEN_EXISTS)
        } else {
            user = userService.createNewUser(email)
            returnMessage.payload = Messages.NEW_USER
        }
        val token = Token()
        token.user = user
        val savedToken = tokenRepository.save(token)
        val host: String? = request.headers.host?.hostString
        emailService.sendEmail(email, host, savedToken.id!!)
        return returnMessage
    }

    @GetMapping("/host/hostname")
    fun getHostname(request: ServerHttpRequest): String? {
        return request.remoteAddress?.hostName
    }
}
