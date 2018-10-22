package com.restaurant.service;

import com.restaurant.dao.CustomerRepo;
import com.restaurant.model.Customer;
import com.restaurant.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	//list all customers
	public List<Customer> getAllCustomers() {

		List<Customer> customers = new ArrayList<>();
		List<CustomerDto> customerDto = new ArrayList<>(customerRepo.getCustomerMap().values());

		//loop through the list of objects from dao and map it into the Customer data model object
		for(CustomerDto dto: customerDto){
			Customer customer = new Customer();
			customer.setFirstName(dto.getCustomerFirstName());
			customer.setId(dto.getCustomerId());
			customer.setLastName(dto.getCustomerLastName());
			customers.add(customer);
		}
		return customers;
	}

	//get a particular customer by customer id
	public Customer getCustomerById(int id) {
		CustomerDto customerDto =  customerRepo.getCustomerMap().get(id);
		Customer customer = new Customer();
		customer.setFirstName(customerDto.getCustomerFirstName());
		customer.setLastName(customerDto.getCustomerLastName());
		customer.setId(customerDto.getCustomerId());
		return customer;

	}

//	//add a new customer
//	public Customer addCustomer(Customer customer) {
//		customer.setId(customerRepo.getCustomerMap().size()+1);
//		customerRepo.getCustomerMap().put(customer.getId(), customer);
//		return customer;
//	}
//
//	//update a customer info given a customer id
//	public Customer updateCustomer(Customer customer) {
//		if(customer.getId()<0) {
//			return null;
//		}else {
//			customerRepo.getCustomerMap().put(customer.getId(), customer);
//			return customer;
//		}
//	}
//
//	//delete a customer
//	public Customer removeCustomer(int id) {
//		return customerRepo.getCustomerMap().remove(id);
//	}
}


