package com.cust.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigRestTamplate {

	@Bean
	public RestTemplate getRestTamplate() {
		return new RestTemplate();
	}
}