package com.scottlogic.reactivegame

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.transaction.annotation.Transactional

interface UserRepository: CrudRepository<User, String> {
    @Modifying
    @Transactional
    @Query(value = //language=JPAQL
    "update User u set current_points = :points where u.id = :id")
    fun updateUserCurrentPointsById (points: Int, id: String)

    @Query(value = "UPDATE firsttest.users SET colour = :colour WHERE id = :id", nativeQuery = true)
    fun updateUserSetColourById (colour: String, id: String)

    @Query(value = "UPDATE firsttest.users SET name = :username WHERE id = :id", nativeQuery = true)
    fun updateUserSetUsernameById (username: String, id: String)
}