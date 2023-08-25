package com.project.vehiclerenterkotlin.confirgation.security

import com.project.vehiclerenterkotlin.repositories.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class JpaUserDetailsService(private val userRepository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.findByUsername(username)

        return User.withUsername(user?.username).password(user?.password).roles(user?.role).build()
    }
}