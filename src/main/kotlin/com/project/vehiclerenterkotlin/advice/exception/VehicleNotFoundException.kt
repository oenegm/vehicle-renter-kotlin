package com.project.vehiclerenterkotlin.advice.exception

class VehicleNotFoundException(id: Long) : RuntimeException("vehicle not found with id: $id")
