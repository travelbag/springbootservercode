package com.iqube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.iqube")
@SpringBootApplication
public class TravelBagApplication {
	public static void main(String[] args) {
		SpringApplication.run(TravelBagApplication.class, args);
	}
}
