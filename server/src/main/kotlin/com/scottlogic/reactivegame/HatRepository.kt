package com.scottlogic.reactivegame

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

//import org.springframework.data.jpa.repository.Query

interface HatRepository: JpaRepository<Hat, String> {
//    @Query(value = "UPDATE firsttest.hats SET in_use = 1 WHERE id = :id", nativeQuery = true)
//    fun setInUseTrueById(id: String)
//
//    @Query(value = "UPDATE firsttest.hats SET in_use = 0 WHERE id IN (SELECT id FROM firsttest.items where user_id = :id)", nativeQuery = true)
//    fun setUserHatsNotInUse(id: String)

//    @Query(value = "")
//    fun setUserHatsNotInUse(id: String)

    @Query(value = //language=JPAQL
    "select u from User u where u.id = :id")
    fun selectUser(id: String): User?


}