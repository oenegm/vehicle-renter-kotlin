package com.project.vehiclerenterkotlin.entity

import jakarta.persistence.*

@Entity
data class Brand(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,

    @Column(name = "name", unique = true)
    var name: String? = null,

    @Column(name = "country")
    var country: String? = null,

    @Column(name = "image_url")
    var imageURL: String? = null,

    @OneToMany
    val vehicles: List<Vehicle>? = null,
)