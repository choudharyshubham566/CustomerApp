package com.cust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cust.model.Customer;

public interface CustomerService {

    Customer createCustomer(Customer customer);
    Customer getCustomerById(Integer id);
    List<Customer> getAllCustomers();
    Customer updateCustomer(Customer customer);
    String deleteCustomer(Integer id);
    
}
