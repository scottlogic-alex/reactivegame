package com.scottlogic.reactivegame

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import org.hibernate.annotations.GenericGenerator
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
        var host: String,
        @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], targetEntity = Item::class)
        @JsonManagedReference
        var items: List<Item>
)

@Entity
@Table(name = "items")
data class Item(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(
                name = "UUID",
                strategy = "org.hibernate.id.UUIDGenerator"
        )
        @Column(name = "id", updatable = false, nullable = false)
        var id: String,
        var name: String,
        @ManyToOne
        @JoinColumn
        @JsonBackReference
        var user: User
)