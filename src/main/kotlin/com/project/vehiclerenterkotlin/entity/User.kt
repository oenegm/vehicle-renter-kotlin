package com.project.vehiclerenterkotlin.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.annotations.UuidGenerator
import java.time.Instant
import java.util.*

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @Size(max = 20)
    @NotNull
    @Column(name = "role", nullable = false, length = 20)
    var role: String? = null

    @Size(max = 255)
    @NotNull
    @Column(name = "username", nullable = false)
    var username: String? = null

    @Size(max = 255)
    @Column(name = "password")
    var password: String? = null

    @NotNull
    @Column(name = "created_at", nullable = false)
    var createdAt: Instant? = null

    @OneToOne(mappedBy = "user")
    var profiles: Profile? = null

    @OneToMany(mappedBy = "renter")
    var rentalRequests: MutableSet<RentalRequest> = mutableSetOf()

    @OneToMany(mappedBy = "owner")
    var vehicles: MutableSet<Vehicle> = mutableSetOf()

    @OneToMany(mappedBy = "user")
    var websiteSettings: MutableSet<WebsiteSetting> = mutableSetOf()
}