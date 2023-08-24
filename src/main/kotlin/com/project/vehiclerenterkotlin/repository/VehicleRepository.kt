package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.Vehicle
import org.springframework.data.jpa.repository.JpaRepository

interface VehicleRepository : JpaRepository<Vehicle, Long> {
}