package com.scottlogic.reactivegame

import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, String> {
    fun findByName(name: String): User?
    fun findByHost(host: String): User?
    fun save(user: User)
}