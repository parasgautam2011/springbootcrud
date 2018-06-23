package com.restaurant.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.restaurant.model.Customer;

@Repository
public class CustomerRepo {

	
	Map<Integer, Customer> customerMap = new HashMap<Integer,Customer>(){
			{
				put(1, new Customer(1,"Paras", "Gautam"));
				put(2, new Customer(2,"Ramesh", "Khadka"));
				put(3, new Customer(3,"Utsav", "Tiwari"));
			}
		};

	
	public Map<Integer, Customer> getCustomerMap() {
		return customerMap;
	}
}
