package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.Rental
import org.springframework.data.jpa.repository.JpaRepository

interface RentalRepository : JpaRepository<Rental, Long> {
}