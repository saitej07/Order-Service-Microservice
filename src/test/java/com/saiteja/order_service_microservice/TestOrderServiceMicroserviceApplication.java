package com.saiteja.order_service_microservice;

import org.springframework.boot.SpringApplication;

public class TestOrderServiceMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrderServiceMicroserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
