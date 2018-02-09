package com.restaurant.repository;

import java.util.HashMap;


import org.springframework.stereotype.Repository;

import com.restaurant.model.Customer;

@Repository
public class CustomerRepo {

	
	HashMap<Integer, Customer> customersMap = new HashMap<Integer,Customer>(){
		{
		put(1, new Customer(1,"Paras", "Gautam"));
		put(2, new Customer(2,"Ramesh", "Khadka"));
		put(3, new Customer(3,"Utsav", "Tiwari"));
		}
	};

	public HashMap<Integer, Customer> getCustomersMap() {
		return customersMap;
	}

	
	

}
