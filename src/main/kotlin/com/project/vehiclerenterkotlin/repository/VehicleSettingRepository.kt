package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.VehicleSetting
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface VehicleSettingRepository : JpaRepository<VehicleSetting, UUID> 
