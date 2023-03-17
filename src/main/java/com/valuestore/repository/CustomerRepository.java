package com.valuestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.valuestore.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	
}
