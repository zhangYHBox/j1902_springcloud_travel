package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer  //标识次服务为注册中心
@SpringBootApplication
public class J1902TravelDispensaryEureka8766Application {

	public static void main(String[] args) {
		SpringApplication.run(J1902TravelDispensaryEureka8766Application.class, args);
	}

}
