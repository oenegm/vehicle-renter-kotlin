package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.CommunicationMethodType
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CommunicationMethodTypeRepository : JpaRepository<CommunicationMethodType, UUID> 
