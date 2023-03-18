package com.timeflow.eurekajava8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaJava8Application {
	public static void main(String[] args) {
		SpringApplication.run(EurekaJava8Application.class, args);
	}
}
