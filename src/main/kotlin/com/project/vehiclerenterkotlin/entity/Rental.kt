package com.project.vehiclerenterkotlin.entity

import com.project.vehiclerenterkotlin.constants.RentalStatus
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Rental (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,

    val requestDate: LocalDateTime? = null,

    val rentDate: LocalDateTime? = null,

    val returnDate: LocalDateTime? = null,

    @Enumerated(EnumType.STRING)
    val rentalStatus: RentalStatus? = null,

    val duration: Int? = null,

    val rating: Float? = null,

    val cost: Double? = null,

    @ManyToOne
    @JoinColumn(name = "renter_id", referencedColumnName = "id", nullable = false)
    val renter: User? = null,

    @ManyToOne
    @JoinColumn(name = "vehicle_id", referencedColumnName = "id", nullable = false)
    val vehicle: Vehicle? = null,
)
