package com.project.vehiclerenterkotlin.repository

import com.project.vehiclerenterkotlin.entity.Brand
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BrandRepository : JpaRepository<Brand, UUID> 
