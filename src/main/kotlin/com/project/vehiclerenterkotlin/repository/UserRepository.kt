package com.project.vehiclerenterkotlin.repository

import com.project.vehiclerenterkotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, UUID> 
