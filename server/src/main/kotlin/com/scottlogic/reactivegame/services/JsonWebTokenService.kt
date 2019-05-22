package com.scottlogic.reactivegame.services

import io.jsonwebtoken.*
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class JsonWebTokenService {

    @Value("\${app.jwtSecret}")
    private val jwtSecret: String? = null

    @Value("\${app.jwtExpirationInMs}")
    private val jwtExpirationInMs: Int = 0

    fun generateCookieToken(userId: String): String {

        val now = Date()
        val expiryDate = Date(now.time + jwtExpirationInMs)

        return Jwts.builder()
                .setSubject(userId)
                .setIssuedAt(Date())
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact()
    }

    fun getUserIdFromJWT(token: String): String? {
        val claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .body

        return claims.subject
    }

    fun validateToken(authToken: String): Boolean {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken)
            return true
        } catch (ex: SignatureException) {
            logger.error("Invalid JWT signature")
        } catch (ex: MalformedJwtException) {
            logger.error("Invalid JWT token")
        } catch (ex: ExpiredJwtException) {
            logger.error("Expired JWT token")
        } catch (ex: UnsupportedJwtException) {
            logger.error("Unsupported JWT token")
        } catch (ex: IllegalArgumentException) {
            logger.error("JWT claims string is empty.")
        }

        return false
    }

    companion object {

        private val logger = LoggerFactory.getLogger(JsonWebTokenService::class.java)
    }
}