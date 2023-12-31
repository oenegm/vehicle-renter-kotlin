package com.project.vehiclerenterkotlin.entities


data class APIResponse(
    val message: String? = null,
    val isSuccessful: Boolean = false,
    val statusCode: Int = 0,
    val data: Any? = null,
)