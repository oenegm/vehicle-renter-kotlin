package com.project.vehiclerenterkotlin.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "brands")
class Brand {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @Size(max = 45)
    @NotNull
    @Column(name = "name", nullable = false, length = 45)
    var name: String? = null

    @Size(max = 45)
    @NotNull
    @Column(name = "country", nullable = false, length = 45)
    var country: String? = null

    @Size(max = 255)
    @NotNull
    @Column(name = "image_link", nullable = false)
    var imageLink: String? = null

    @OneToMany(mappedBy = "brand")
    private var vehicles: MutableSet<Vehicle> = mutableSetOf()
}