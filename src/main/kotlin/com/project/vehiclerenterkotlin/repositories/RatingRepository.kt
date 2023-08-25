package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.Rating
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RatingRepository : JpaRepository<Rating, UUID> 
