package com.exm.model.user.modeluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ModelUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelUserApplication.class, args);
	}
    @Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
