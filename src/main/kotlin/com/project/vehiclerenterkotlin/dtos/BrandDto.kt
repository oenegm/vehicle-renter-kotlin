package com.project.vehiclerenterkotlin.dtos

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.URL
import java.io.Serializable
import java.util.*

/**
 * DTO for {@link com.project.vehiclerenterkotlin.entities.Brand}
 */
data class BrandDto(
    @field:NotNull val id: UUID? = null,
    @field:NotNull @field:Size(max = 45) @field:NotEmpty val name: String? = null,
    @field:NotNull @field:Size(max = 45) @field:NotEmpty val country: String? = null,
    @field:NotNull @field:Size(max = 255) @field:NotEmpty @field:URL val imageLink: String? = null
) : Serializable