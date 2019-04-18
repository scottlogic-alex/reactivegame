package com.scottlogic.reactivegame

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserRepository: JpaRepository<User, String> {
    fun findByName(name: String): User?
    fun findByHost(host: String): User?
    fun save(user: User)
    @Query(value = "UPDATE firsttest.users SET colour = :colour WHERE host = :host", nativeQuery = true)
    fun updateUserSetColourForHost (colour: String, host: String)
    @Query(value = "UPDATE firsttest.users SET name = :username WHERE host = :host", nativeQuery = true)
    fun updateUserSetUsernameForHost (username: String, host: String)
}