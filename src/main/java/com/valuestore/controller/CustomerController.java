package com.valuestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.valuestore.CustomerForm;
import com.valuestore.service.CustomerService;



@Controller
public class CustomerController {
	@Autowired
	public CustomerService customerService;

	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	public ResponseEntity<CustomerForm> createCustomer(@RequestBody CustomerForm customerForm) {
		System.out.println("aannd");
		System.out.println(customerForm);
		CustomerForm savedcustomerForm = customerService.createCustomer(customerForm);
		return ResponseEntity.status(HttpStatus.OK).body(savedcustomerForm);
	}


}
