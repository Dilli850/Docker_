package com.nt.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjectEurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEurekaServer1Application.class, args);
	}

}
