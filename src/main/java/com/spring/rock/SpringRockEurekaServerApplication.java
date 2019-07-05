package com.spring.rock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringRockEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRockEurekaServerApplication.class, args);
	}

}
