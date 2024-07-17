package com.cust.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cust.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
