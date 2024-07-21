package com.cust.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cust.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
