package com.altimetrik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CDemo01SpringBoot01Microservice03Application {

	public static void main(String[] args) {
		SpringApplication.run(CDemo01SpringBoot01Microservice03Application.class, args);
	}
	
	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}
}
