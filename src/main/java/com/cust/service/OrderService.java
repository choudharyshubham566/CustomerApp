package com.cust.service;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cust.annotation.LogCustomer;
import com.cust.dto.order.Order;

@Service
public class OrderService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired()
	private Environment env;

	@LogCustomer
	public List<Order> getOrdersByCustomerId(Integer customerId) {
		String orderServiceUrl = env.getProperty("order.service.url");
		Order[] orders = restTemplate.getForObject(orderServiceUrl + customerId, Order[].class);
		
		//We will get order only with status Approved.
		return Arrays.asList(orders);
	}
}
