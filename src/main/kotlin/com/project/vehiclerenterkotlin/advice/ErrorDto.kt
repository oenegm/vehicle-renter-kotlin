package com.project.vehiclerenterkotlin.advice

import java.io.Serializable

data class ErrorDto(
    var code: String? = null,
    var message: String? = null
) : Serializable
