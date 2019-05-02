package com.scottlogic.reactivegame

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, String> {
    fun findByName(name: String): User?
    fun findByHost(host: String): User?
//    fun save(user: User)
//    @Query(value = "UPDATE firsttest.users SET colour = :colour WHERE host = :host", nativeQuery = true)
//    fun updateUserSetColourForHost (colour: String, host: String)

    @Query(value = "UPDATE firsttest.users SET colour = :colour WHERE id = :id", nativeQuery = true)
    fun updateUserSetColourById (colour: String, id: String)

    @Query(value = "UPDATE firsttest.users SET name = :username WHERE id = :id", nativeQuery = true)
    fun updateUserSetUsernameById (username: String, id: String)
}