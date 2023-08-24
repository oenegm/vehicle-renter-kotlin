package com.project.vehiclerenterkotlin.entity

import jakarta.persistence.*

@Entity
data class Role (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null,
    private val name: String? = null,

    @OneToMany(mappedBy = "role")
    private val users: List<User>? = null,
)
