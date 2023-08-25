package com.project.vehiclerenterkotlin

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


val logger = KotlinLogging.logger {}


@SpringBootApplication
class VehicleRenterKotlinApplication

fun main(args: Array<String>) {
    runApplication<VehicleRenterKotlinApplication>(*args)
}

@Bean
fun applicationRunner(): ApplicationRunner {
    return ApplicationRunner { _: ApplicationArguments? ->
        logger.info { "app started" }
    }
}
