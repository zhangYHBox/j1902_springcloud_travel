package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class J1902TravelConsumerPortal10001Application {

	public static void main(String[] args) {
		SpringApplication.run(J1902TravelConsumerPortal10001Application.class, args);
	}

}
