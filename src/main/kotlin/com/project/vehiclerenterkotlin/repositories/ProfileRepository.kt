package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.Profile
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProfileRepository : JpaRepository<Profile, UUID> 
