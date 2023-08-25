package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.Vehicle
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface VehicleRepository : JpaRepository<Vehicle, UUID> 
