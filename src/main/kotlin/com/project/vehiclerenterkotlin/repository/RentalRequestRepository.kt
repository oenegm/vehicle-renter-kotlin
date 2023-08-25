package com.project.vehiclerenterkotlin.repository

import com.project.vehiclerenterkotlin.entity.RentalRequest
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RentalRequestRepository : JpaRepository<RentalRequest, UUID> 
