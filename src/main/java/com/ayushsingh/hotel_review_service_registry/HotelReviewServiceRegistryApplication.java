package com.ayushsingh.hotel_review_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //The @EnableEurekaServer annotation is used to make your Spring Boot application acts as a Eureka Server.
public class HotelReviewServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReviewServiceRegistryApplication.class, args);
	}

}
