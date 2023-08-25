package com.project.vehiclerenterkotlin.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "communication_methods")
class CommunicationMethod {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    var profile: Profile? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type")
    var type: CommunicationMethodType? = null

    @Size(max = 255)
    @NotNull
    @Column(name = "value", nullable = false)
    var value: String? = null
}