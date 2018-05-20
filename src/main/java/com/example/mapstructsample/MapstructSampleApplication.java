package com.example.mapstructsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.mapstructsample")
public class MapstructSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapstructSampleApplication.class, args);
	}
}
