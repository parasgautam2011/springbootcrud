package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.Customer;
import com.restaurant.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	//list all customers
	public List<Customer> getAllCustomers() {
		return new ArrayList<Customer>(customerRepo.getCustomersMap().values());
	}

	//get a particular customer by customer id
	public Customer getCustomerById(int id) {
		return customerRepo.getCustomersMap().get(id);
	}

	//add a new customer
	public Customer addCustomer(Customer customer) {
		customer.setId(customerRepo.getCustomersMap().size()+1);
		customerRepo.getCustomersMap().put(customer.getId(), customer);
		return customer;
	}
	
	//update a customer info given a customer id
	public Customer updateCustomer(Customer customer) {
		if(customer.getId()<0) {
			return null;
		}else {
			customerRepo.getCustomersMap().put(customer.getId(), customer);
			return customer;
		}
	}
	
	//delete a customer
	public Customer removeCustomer(int id) {
		return customerRepo.getCustomersMap().remove(id);
	}
}


