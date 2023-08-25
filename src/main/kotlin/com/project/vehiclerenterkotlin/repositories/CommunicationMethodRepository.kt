package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.CommunicationMethod
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CommunicationMethodRepository : JpaRepository<CommunicationMethod, UUID> 
