package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.Brand
import org.springframework.data.jpa.repository.JpaRepository

interface BrandRepository : JpaRepository<Brand, Long> {
}