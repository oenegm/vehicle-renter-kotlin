package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.Brand
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BrandRepository : JpaRepository<Brand, UUID> 
