package com.scottlogic.reactivegame

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
        )
        @Column(name = "id", updatable = false, nullable = false)
        var id: String,
        var name: String,
        var colour: String,
        var host: String
)