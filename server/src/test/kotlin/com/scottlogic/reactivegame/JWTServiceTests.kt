package com.scottlogic.reactivegame

import com.scottlogic.reactivegame.services.JsonWebTokenService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class JWTServiceTests {

    @Autowired
    private lateinit var jwtService: JsonWebTokenService

    @Test
    fun generateJWT() {
        val token = jwtService.generateCookieToken("FAKEUSER")
        println(token)
    }

}