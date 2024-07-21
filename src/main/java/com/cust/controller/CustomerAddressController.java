package com.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cust.model.CustomerAddress;
import com.cust.service.CustomerAddressService;

@RestController
@RequestMapping("/customerApp")
public class CustomerAddressController {

	@Autowired
	private CustomerAddressService custService;

	@PostMapping("/addAddress")
	public ResponseEntity<CustomerAddress> addCustomer(@RequestBody CustomerAddress address) {
		CustomerAddress newAddress = custService.createAddress(address);
		return new ResponseEntity<CustomerAddress>(newAddress, HttpStatus.OK);
	}

	@GetMapping("/getAddress/{id}")
	public ResponseEntity<CustomerAddress> getAddress(@PathVariable Integer id) {
		CustomerAddress address = custService.getAddressById(id);
		return new ResponseEntity<>(address, HttpStatus.OK);
	}
	
}
