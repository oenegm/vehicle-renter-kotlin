package com.project.vehiclerenterkotlin.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.project.vehiclerenterkotlin.constants.Gender
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import java.time.LocalDateTime

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "username", unique = true)
    var username: @NotBlank(message = "Username is required") String? = null,

    @Column(name = "name")
    var name: @NotBlank(message = "Name is required") String? = null,

    @Column(name = "email", unique = true)
    var email: @NotBlank(message = "Email is required") String? = null,

    @JsonIgnore
    @Column(name = "password")
    var password: @NotBlank(message = "Password is required") String? = null,

    @Column(name = "phone_number")
    var phoneNumber: @NotBlank(message = "Phone number is required") String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    var gender: @NotBlank(message = "Gender is required") Gender? = null,

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    var createdAt: LocalDateTime? = null,

    @ManyToOne
    val role: Role? = null,

    @OneToMany(mappedBy = "owner")
    val ownedVehicles: List<Vehicle>? = null,

    @OneToMany(mappedBy = "renter")
    val rentals: List<Rental>? = null,
) {
    @PrePersist
    fun prePersist() {
        createdAt = LocalDateTime.now()
    }
}