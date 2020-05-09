package com.suresh.practice.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NovaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovaEurekaServerApplication.class, args);
	}

}
