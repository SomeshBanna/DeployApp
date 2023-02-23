package com.mindtree.serverdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployAppApplication {

	public static void main(String[] args) {
		System.out.println("Deploy App");
		SpringApplication.run(DeployAppApplication.class, args);
	}

}
