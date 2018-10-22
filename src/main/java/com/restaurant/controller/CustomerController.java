package com.restaurant.controller;

import com.restaurant.model.Customer;
import com.restaurant.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/customers/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") int custId) {
		return customerService.getCustomerById(custId);
	}
//
//	@PostMapping("/customers")
//	public Customer addCustomer(@RequestBody Customer customer) {
//		return customerService.addCustomer(customer);
//	}
//
//	@PutMapping("/customers/{customerId}")
//	public Customer updateCustomer(@PathVariable("customerId") int custId, @RequestBody Customer customer) {
//		return customerService.updateCustomer(customer);
//	}
//
//	@DeleteMapping("/customers/{customerId}")
//	public Customer deleteCustomer(@PathVariable("customerId") int custId) {
//		return customerService.removeCustomer(custId);
//	}

}
