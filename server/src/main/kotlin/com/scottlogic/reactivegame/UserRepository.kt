package com.scottlogic.reactivegame

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface UserRepository: CrudRepository<User, String> {
    fun findByName(name: String): User?
    fun findByHost(host: String): User?
    fun save(user: User)
    @Query(value = "UPDATE firsttest.users SET colour = :colour WHERE host = :host", nativeQuery = true)
    fun updateUserSetColourForHost (colour: String, host: String)
    @Query(value = "UPDATE firsttest.users SET name = :username WHERE host = :host", nativeQuery = true)
    fun updateUserSetUsernameForHost (username: String, host: String)
}