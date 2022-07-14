package com.cts.caseStudy3.airlines.service;

import com.cts.caseStudy3.airlines.model.Customer;

public interface CustomerService {

	void save(Customer customer);
	
	boolean checkLogin(String c_name, String c_pass);
	
	Customer getCustomer(String name);
}
