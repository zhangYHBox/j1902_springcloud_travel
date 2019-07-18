package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class J1902TravelConfigServer9090Application {

	public static void main(String[] args) {
		SpringApplication.run(J1902TravelConfigServer9090Application.class, args);
	}

}
