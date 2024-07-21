package com.cust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.annotation.LogCustomer;
import com.cust.exception.CustomerNotFondException;
import com.cust.model.CustomerAddress;
import com.cust.repo.CustomerAddressRepository;

@Service
public class CustomerAdressServiceImpl implements CustomerAddressService {

	@Autowired
	private CustomerAddressRepository addressRepo;

	@LogCustomer
	@Override
	public CustomerAddress createAddress(CustomerAddress address) {

		return addressRepo.save(address);
	}

	@LogCustomer
	@Override
	public CustomerAddress getAddressById(Integer id) {

		CustomerAddress adress = addressRepo.findById(id)
				.orElseThrow(() -> new CustomerNotFondException("CustomerAdress with Id " + id + " does not exist"));

		return adress;
	}

}
