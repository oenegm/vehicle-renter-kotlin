package com.project.vehiclerenterkotlin.repositories

import com.project.vehiclerenterkotlin.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, UUID> {

    fun findByUsername(username: String): User?
}
