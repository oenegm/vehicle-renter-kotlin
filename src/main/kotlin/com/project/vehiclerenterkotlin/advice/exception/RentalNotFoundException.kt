package com.project.vehiclerenterkotlin.advice.exception

class RentalNotFoundException(id: Long) : RuntimeException("rental not found with id: $id")
