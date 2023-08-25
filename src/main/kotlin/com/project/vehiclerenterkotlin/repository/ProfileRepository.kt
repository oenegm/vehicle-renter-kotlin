package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.Profile
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProfileRepository : JpaRepository<Profile, UUID> 
