package com.restaurant.dao;

import com.restaurant.model.CustomerDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepo {

	//dummy db
	Map<Integer, CustomerDto> customerMap = new HashMap<Integer,CustomerDto>(){
			{
				put(1, new CustomerDto(1,"Paras", "Gautam","447567656","my-home-address","7056543456","paras@email.com"));
				put(2, new CustomerDto(2,"Ramesh", "Khadka","447568888","ramesh-home-address","5056543456","ramesh@email.com"));
				put(3, new CustomerDto(3,"Utsav", "Tiwari","447569999","utsav-home-address","6056543456","utsav@email.com"));
			}
		};

	public Map<Integer, CustomerDto> getCustomerMap() {
		return customerMap;
	}
}
