package com.schoolofnet.auditoriacomsprin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

	private final CustomerRepository repository;

	public CustomerController(CustomerRepository repository) {
		this.repository = repository;
	}

	@PostMapping
	public CustomerModel create(@RequestBody CustomerModel customer) {
		return this.repository.save(customer);
	}
}
