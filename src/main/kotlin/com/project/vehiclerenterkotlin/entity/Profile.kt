package com.project.vehiclerenterkotlin.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "profiles")
class Profile {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var user: User? = null

    @Size(max = 45)
    @NotNull
    @Column(name = "name", nullable = false, length = 45)
    var name: String? = null

    @Size(max = 255)
    @Column(name = "profile_picture_link")
    var profilePictureLink: String? = null

    @Column(name = "bio", length = Integer.MAX_VALUE)
    var bio: String? = null

    @OneToMany(mappedBy = "profile")
    var communicationMethods: MutableSet<CommunicationMethod> = mutableSetOf()
}