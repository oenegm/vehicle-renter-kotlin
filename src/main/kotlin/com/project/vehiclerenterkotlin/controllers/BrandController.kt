package com.project.vehiclerenterkotlin.controllers

import com.project.vehiclerenterkotlin.dtos.BrandDto
import com.project.vehiclerenterkotlin.mappers.BrandMapper
import com.project.vehiclerenterkotlin.services.BrandService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/brands")
class BrandController(private val service: BrandService, private val brandMapper: BrandMapper) {

    @GetMapping
    fun getAllBrands(): List<BrandDto> = service.getAllBrands().map(brandMapper::toDto)
}