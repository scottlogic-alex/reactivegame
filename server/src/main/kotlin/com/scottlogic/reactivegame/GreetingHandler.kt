package com.scottlogic.reactivegame

import org.springframework.http.MediaType
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

//data class Greeting(
//        val message: String
//)

//data class Person(
//        val name: String
//)

//class GreetingHandler {
//    fun hello(request: ServerRequest): Mono<ServerResponse> {
//        val notFound = ServerResponse.notFound().build()
//        val personMono = request.bodyToMono(Person::class.java)
//        return personMono.flatMap {
//            ServerResponse.ok()
//                    .contentType(MediaType.APPLICATION_JSON_UTF8)
//                    .body(fromObject(it))
//                    .switchIfEmpty(notFound)
//        }
//    }
//}