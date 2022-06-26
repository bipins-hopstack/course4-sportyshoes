package com.sportyshoes.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sportyshoes.rest.controller")
public class SportyshoesadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyshoesadminApplication.class, args);
	}

}
