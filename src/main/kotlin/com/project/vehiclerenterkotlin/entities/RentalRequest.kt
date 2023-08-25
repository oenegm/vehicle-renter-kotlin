package com.project.vehiclerenterkotlin.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import org.hibernate.annotations.UuidGenerator
import java.math.BigDecimal
import java.time.LocalDate
import java.util.*

@Entity
@Table(name = "rental_requests")
class RentalRequest {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "renter_id")
    var renter: User? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    var vehicle: Vehicle? = null

    @NotNull
    @Column(name = "request_date", nullable = false)
    var requestDate: LocalDate? = null

    @NotNull
    @Column(name = "rent_date", nullable = false)
    var rentDate: LocalDate? = null

    @NotNull
    @Column(name = "return_date", nullable = false)
    var returnDate: LocalDate? = null

    @Column(name = "accepted_price", precision = 11, scale = 2)
    var acceptedPrice: BigDecimal? = null

    @OneToMany(mappedBy = "rentalRequest")
    var ratings: MutableSet<Rating> = mutableSetOf()

    /*
            TODO [JPA Buddy] create field to map the 'duration' column
             Available actions: Define target Java type | Uncomment as is | Remove column mapping
            @Column(name = "duration", columnDefinition = "interval(0, 0) not null")
            var duration: Any? = null
        */
}