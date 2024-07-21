package com.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.cust.annotation.LogCustomer;
import com.cust.model.Country;
import com.cust.model.State;
import com.cust.repo.CountryRepository;
import com.cust.repo.StateRepository;

public class ReferenceDataService {

	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	private List<Country> countries;
    private List<State> states;
    
    @LogCustomer
    public void loadReferenceData() {
        countries = countryRepository.findAll();
        states = stateRepository.findAll();
    }
    
    @LogCustomer
    @Cacheable("countries")
    public List<Country> getCountries() {
        return countries;
    }

    @LogCustomer
    @Cacheable("states")
    public List<State> getStates() {
        return states;
    }
    
}
