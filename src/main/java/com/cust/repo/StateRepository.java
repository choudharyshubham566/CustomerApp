package com.cust.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cust.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{

}
