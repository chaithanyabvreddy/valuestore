package com.valuestore.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valuestore.CustomerForm;
import com.valuestore.entity.Customer;
import com.valuestore.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	public CustomerRepository customerRepository;

	public CustomerForm createCustomer(CustomerForm customerForm) {
		Customer customer = new Customer();
		BeanUtils.copyProperties(customerForm, customer);
		Customer savedCustomer = customerRepository.save(customer);
		customerForm.setId(savedCustomer.getId());
		return customerForm;
	}

	
}

