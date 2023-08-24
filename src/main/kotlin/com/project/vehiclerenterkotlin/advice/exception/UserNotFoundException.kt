package com.project.vehiclerenterkotlin.advice.exception

class UserNotFoundException(id: Long) : RuntimeException("user not found with id: $id")
