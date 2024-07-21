package com.cust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cust.annotation.LogCustomer;
import com.cust.model.Country;
import com.cust.repo.CountryRepository;

@RestController
@RequestMapping("/customerApp")
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@LogCustomer
	@GetMapping("/countries")
	public ResponseEntity<List<Country>> getCountries(){
		List<Country> countries = countryRepository.findAll();
		
		return new ResponseEntity<List<Country>>(countries,HttpStatus.OK);
	}
}
