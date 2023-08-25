package com.project.vehiclerenterkotlin.entities

import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "ratings")
class Rating {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rental_request_id")
    var rentalRequest: RentalRequest? = null

    @Column(name = "vehicle_rating")
    var vehicleRating: Short? = null

    @Column(name = "owner_rating")
    var ownerRating: Short? = null

    @Column(name = "renter_rating")
    var renterRating: Short? = null
}