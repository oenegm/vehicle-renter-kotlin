package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.CommunicationMethod
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CommunicationMethodRepository : JpaRepository<CommunicationMethod, UUID> 
