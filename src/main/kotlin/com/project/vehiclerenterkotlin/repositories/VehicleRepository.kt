package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.Vehicle
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface VehicleRepository : JpaRepository<Vehicle, UUID> 
