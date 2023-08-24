package com.project.vehiclerenterkotlin.advice.exception

class BrandNotFoundException(id: Long) : RuntimeException("brand not found with id: $id")
