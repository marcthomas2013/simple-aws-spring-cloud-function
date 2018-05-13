package com.amazonaws.lambda.demo;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionAwsApplication {
	
	@Bean
	public Function<String, String> uppercase() {
		return (String request) -> request.toUpperCase();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionAwsApplication.class, args);
	}
}
