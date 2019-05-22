package com.scottlogic.reactivegame.services

import com.scottlogic.reactivegame.User
import com.scottlogic.reactivegame.UserRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random
import kotlin.random.nextUBytes

@Service
class UserService(
        private val userRepository: UserRepository
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

}