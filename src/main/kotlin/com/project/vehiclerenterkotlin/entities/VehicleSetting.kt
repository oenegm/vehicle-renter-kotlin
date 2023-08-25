package com.project.vehiclerenterkotlin.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "vehicle_settings")
class VehicleSetting {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id")
    var vehicle: Vehicle? = null

    @NotNull
    @Column(name = "is_visible", nullable = false)
    var isVisible: Boolean? = false

    @NotNull
    @Column(name = "is_out_of_order", nullable = false)
    var isOutOfOrder: Boolean? = false
}