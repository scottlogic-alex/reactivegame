package com.scottlogic.reactivegame

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TokenRepository: CrudRepository<Token, String> {

    @Query(value = //language=HQL
    "Select t from Token t where t.user.id = :userId and t.expiry_time > current_time " )
    fun selectTokenByUser(userId: String) : Optional<Token>

}
