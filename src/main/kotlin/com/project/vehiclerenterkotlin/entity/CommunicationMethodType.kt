package com.project.vehiclerenterkotlin.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "communication_method_types")
class CommunicationMethodType {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @Size(max = 20)
    @NotNull
    @Column(name = "name", nullable = false, length = 20)
    var name: String? = null

    @OneToMany(mappedBy = "type")
    var communicationMethods: MutableSet<CommunicationMethod> = mutableSetOf()
}