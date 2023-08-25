package com.project.vehiclerenterkotlin.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Table(name = "website_settings")
class WebsiteSetting {
    @Id
    @GeneratedValue
    @UuidGenerator
    @Column(name = "id", nullable = false)
    var id: UUID? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var user: User? = null

    @NotNull
    @Column(name = "is_dark_mode", nullable = false)
    var isDarkMode: Boolean? = false

    @Size(max = 20)
    @NotNull
    @Column(name = "language", nullable = false, length = 20)
    var language: String? = null
}