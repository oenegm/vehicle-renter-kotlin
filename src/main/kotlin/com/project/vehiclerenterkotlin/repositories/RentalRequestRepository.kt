package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.RentalRequest
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RentalRequestRepository : JpaRepository<RentalRequest, UUID> 
