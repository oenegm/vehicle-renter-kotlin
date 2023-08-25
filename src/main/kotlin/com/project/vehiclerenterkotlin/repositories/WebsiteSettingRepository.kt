package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.WebsiteSetting
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface WebsiteSettingRepository : JpaRepository<WebsiteSetting, UUID> 
