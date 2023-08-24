package com.project.vehiclerenterkotlin.repository;

import com.project.vehiclerenterkotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}