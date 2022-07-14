package com.cts.caseStudy3.airlines.dao;

import com.cts.caseStudy3.airlines.model.Customer;

public interface CustomerDAO {

	public void save(Customer customer);
	
	public boolean checkLogin(String c_name, String c_pass);
	
	public Customer getCustomer(String name);
	
}
