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
fun applicationRunner(
//	userRepository: UserRepository,
//	brandRepository: BrandRepository,
//	roleRepository: RoleRepository,
//	passwordEncoder: PasswordEncoder
): ApplicationRunner {
    return ApplicationRunner { _: ApplicationArguments? ->

//        val vehicle = Vehicle(
//            id = 56,
//            color = "Blue",
//            brand = Brand(
//                id = 15,
//                name = "BMW",
//                country = "Germany"
//            ),
//            model = "3 Series"
//        )

        logger.debug { "app started" }


//		val brand: Brand = Brand.builder()
//			.name("BMW")
//			.country("Germany")
//			.imageURL("https://upload.wikimedia.org/wikipedia/commons/f/f4/BMW_logo_%28gray%29.svg")
//			.build()
//		brandRepository.save(brand)
//		roleRepository.save(
//			Role.builder()
//				.name("ADMIN")
//				.build()
//		)
//		roleRepository.save(
//			Role.builder()
//				.name("USER")
//				.build()
//		)
//		val admin: User = User.builder()
//			.username("admin")
//			.password(passwordEncoder.encode("123456"))
//			.role(
//				roleRepository.findByName("ADMIN")
//					.orElseThrow { RuntimeException("Role not found") }
//			)
//			.build()
//		val user: User = User.builder()
//			.username("oenegm")
//			.password(passwordEncoder.encode("123456"))
//			.role(
//				roleRepository.findByName("USER")
//					.orElseThrow { RuntimeException("Role not found") }
//			)
//			.build()
//		userRepository.saveAll(List.of(admin, user))
    }
}
