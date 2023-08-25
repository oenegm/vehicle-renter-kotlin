package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.Rating
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface RatingRepository : JpaRepository<Rating, UUID> 
