package com.scottlogic.reactivegame

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import org.hibernate.annotations.GenericGenerator
import java.time.*
import java.time.temporal.TemporalUnit
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
        var id: String = "",
        var name: String,
        var colour: String,
        var host: String = "",
        @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], targetEntity = Item::class)
        @JsonManagedReference
        var items: List<Item> = mutableListOf(),
        var current_points: Int = 0,
        @Column(columnDefinition = "TIMESTAMP")
        var last_activity: Instant = Instant.EPOCH,
        var high_score: Int = 0
) {
        @PrePersist
        @PreUpdate
        fun updateTimestamps() {
                last_activity = Instant.now()
        }
}

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="type")
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes(value = [
        JsonSubTypes.Type(value = Item::class, name = "Hat")
])
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
        @Column(name="in_use")
        var inUse: Boolean? = null
}

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="login_tokens")
class Token {
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(
                name = "UUID",
                strategy = "org.hibernate.id.UUIDGenerator"
        )
        @Column(name = "id", updatable = false, nullable = false)
        var id: String? = null
        @Column(columnDefinition = "TIMESTAMP")
        var expiry_time: Instant = Instant.now().plusMillis(3600000) //instant now plus one hour?
        @ManyToOne
        @JoinColumn
        @JsonBackReference
        var user: User? = null
}



