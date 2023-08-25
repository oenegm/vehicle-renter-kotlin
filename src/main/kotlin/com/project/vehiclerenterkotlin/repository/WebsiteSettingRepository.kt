package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.WebsiteSetting
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface WebsiteSettingRepository : JpaRepository<WebsiteSetting, UUID> 
