package com.project.vehiclerenterkotlin.advice

import com.project.vehiclerenterkotlin.advice.exception.BrandNotFoundException
import com.project.vehiclerenterkotlin.advice.exception.RentalNotFoundException
import com.project.vehiclerenterkotlin.advice.exception.UserNotFoundException
import com.project.vehiclerenterkotlin.advice.exception.VehicleNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler(
        BrandNotFoundException::class,
        RentalNotFoundException::class,
        UserNotFoundException::class,
        VehicleNotFoundException::class
    )
    fun advice(exception: RuntimeException): ResponseEntity<ErrorDto> {
        return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(
                ErrorDto(HttpStatus.NOT_FOUND.reasonPhrase, exception.message)
            )
    }
}
