package com.project.vehiclerenterkotlin.entity

import com.project.vehiclerenterkotlin.constants.FuelType
import com.project.vehiclerenterkotlin.constants.TransmissionType
import com.project.vehiclerenterkotlin.constants.VehicleStatus
import com.project.vehiclerenterkotlin.constants.VehicleType
import jakarta.persistence.*
import jakarta.validation.constraints.Min

@Entity
data class Vehicle(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id", nullable = false)
    val owner: User? = null,

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id", nullable = false)
    val brand: Brand? = null,

    @OneToMany(mappedBy = "vehicle")
    val rentals: List<Rental>? = null,

    val model: String? = null,

    val year: Int? = null,

    val imageURL: String? = null,

    val address: String? = null,

    val registrationNumber: String? = null,

    val color: String? = null,

    val numberOfSeats: String? = null,

    val numberOfDoors: String? = null,

    @Enumerated(EnumType.STRING)
    val vehicleType: VehicleType? = null,

    @Enumerated(EnumType.STRING)
    val transmissionType: TransmissionType? = null,

    @Enumerated(EnumType.STRING)
    val fuelType: FuelType? = null,

    @Enumerated(EnumType.STRING)
    val vehicleStatus: VehicleStatus? = null,

    val pricePerDay: @Min(1) Double? = null,

    val rating: Float? = null,
)
