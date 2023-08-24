package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<Role, Long> {
}