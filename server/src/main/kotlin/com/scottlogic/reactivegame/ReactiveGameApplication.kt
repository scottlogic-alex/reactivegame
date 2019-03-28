package com.scottlogic.reactivegame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveGameApplication

fun main(args: Array<String>) {
	runApplication<ReactiveGameApplication>(*args)
}
