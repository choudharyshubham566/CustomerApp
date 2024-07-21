package com.cust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableCaching
public class CustomerAppApplication {

	public static void main(String[] args) {	
		SpringApplication.run(CustomerAppApplication.class, args);
	}

}
