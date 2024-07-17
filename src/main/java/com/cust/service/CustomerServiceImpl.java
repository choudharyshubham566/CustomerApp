package com.cust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.exception.CustomerNotFondException;
import com.cust.model.Customer;
import com.cust.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer getCustomerById(Integer id) {
		return customerRepository.findById(id)
				.orElseThrow(() -> new CustomerNotFondException("Customer with Id " +id +" does not exist"));
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return customers;
	}

	@Override
	public String deleteCustomer(Integer id) {

		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new CustomerNotFondException("Customer with Id " +id +" does not exist"));
		if (customer != null) {
			customerRepository.delete(customer);
			return "Customer Deleted Successfully";
		} else {
			return "No customer found by this id : " + id;
		}

	}

	@Override
	public Customer updateCustomer(Customer updatedCustomer) {

		Customer existingCustomer = customerRepository.findById(updatedCustomer.getCustomerId())
				.orElseThrow(() -> new CustomerNotFondException(
						"Customer with Id : " + updatedCustomer.getCustomerId() + " does not exist"));
		existingCustomer.setFirstName(updatedCustomer.getFirstName());
		existingCustomer.setLastName(updatedCustomer.getLastName());
		existingCustomer.setEmail(updatedCustomer.getEmail());
		existingCustomer.setPhone(updatedCustomer.getPhone());

		return customerRepository.save(existingCustomer);
	}

}
