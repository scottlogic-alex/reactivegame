package com.scottlogic.reactivegame

import org.springframework.data.repository.CrudRepository

interface TokenRepository: CrudRepository<Token, String> {

}