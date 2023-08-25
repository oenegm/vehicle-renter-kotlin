package com.project.vehiclerenterkotlin.repository

import com.project.vehiclerenterkotlin.entity.CommunicationMethodType
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CommunicationMethodTypeRepository : JpaRepository<CommunicationMethodType, UUID> 
