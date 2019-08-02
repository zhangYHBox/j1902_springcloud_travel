package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient  //注册服务到注册中心
@EnableZuulProxy  //开启智能路由代理服务
@SpringBootApplication
public class J1902TravelZuul10010Application {

	public static void main(String[] args) {
		SpringApplication.run(J1902TravelZuul10010Application.class, args);
	}

}
