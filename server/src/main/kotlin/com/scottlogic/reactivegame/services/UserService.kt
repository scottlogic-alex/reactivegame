package com.scottlogic.reactivegame.services

import com.scottlogic.reactivegame.Hat
import com.scottlogic.reactivegame.User
import com.scottlogic.reactivegame.UserRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random
import kotlin.random.nextUBytes

@Service
class UserService(
        private val userRepository: UserRepository,
        private val jwtservice: JsonWebTokenService
) {

    @ExperimentalUnsignedTypes
    private fun getColour(channels: UByteArray): String {
        return "#"+"%02X".repeat(3)
                .format(*channels.map(UByte::toInt).toTypedArray())
    }

    fun createNewUser(email: String): User {
            // redirect user to request a link page
            val user = User(
                    name = "new user",
                    colour = getColour(Random.nextUBytes(3)),
                    email = email
            )
            return userRepository.save(user)
        }

    fun ensureUserExists(id: String): Optional<User> {
        var user: Optional<User>
        if (id == "") {
            user = Optional.of(createNewUser(""))
        }
        else user = userRepository.findById(id)
        return user
    }

    fun getUserByJWT(token: String): Optional<User> {
        if (token != "") {
            val valid: Boolean = jwtservice.validateToken(token)
            if (valid) {
                val userId = jwtservice.getUserIdFromJWT(token)
                if (userId != null) {
                    val user = userRepository.findById(userId)
                    if (user.isPresent) return user
                }
            }
        }
        return Optional.empty()
    }

    fun updateUser(user: User, hatId: String, colour: String, username: String) {
        user.items.filterIsInstance<Hat>().forEach { it.inUse = false }
        if (hatId != "noHat") {
            user.items.filterIsInstance<Hat>().find { it.id == hatId }?.inUse = true
        }
        user.colour = colour
        user.name = username
        userRepository.save(user)
    }

}