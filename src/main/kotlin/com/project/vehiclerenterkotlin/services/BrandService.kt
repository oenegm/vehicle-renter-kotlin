package com.project.vehiclerenterkotlin.services

import com.project.vehiclerenterkotlin.entities.Brand
import com.project.vehiclerenterkotlin.repositories.BrandRepository
import org.springframework.stereotype.Service

@Service
class BrandService(private val repository: BrandRepository) {

    fun getAllBrands(): MutableList<Brand> = repository.findAll()
}