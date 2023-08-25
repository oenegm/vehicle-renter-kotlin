package com.project.vehiclerenterkotlin.mappers

import com.project.vehiclerenterkotlin.dtos.BrandDto
import com.project.vehiclerenterkotlin.entities.Brand
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
abstract class BrandMapper {

    abstract fun toEntity(brandDto: BrandDto): Brand

    abstract fun toDto(brand: Brand): BrandDto

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract fun partialUpdate(brandDto: BrandDto, @MappingTarget brand: Brand): Brand
}