package com.scottlogic.reactivegame

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import com.sun.org.apache.xpath.internal.operations.Bool
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
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type")
@Table(name = "items")
class Item {
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(
                name = "UUID",
                strategy = "org.hibernate.id.UUIDGenerator"
        )
        @Column(name = "id", updatable = false, nullable = false)
        var id: String? = null
        var consumable: Boolean? = null
        @ManyToOne
        @JoinColumn
        @JsonBackReference
        var user: User? = null
}

@Entity
@Table(name="hats")
@DiscriminatorValue("HAT")
class Hat: Item() {
        var name: String? = null
}