package com.cts.caseStudy3.airlines.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.caseStudy3.airlines.dao.CustomerDAO;
import com.cts.caseStudy3.airlines.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	private static final Logger logger = LogManager.getLogger(CustomerServiceImpl.class); 
	@Override
	@Transactional
	public void save(Customer customer) {
		logger.debug("Entered save() in CustomerServiceImpl");
		customerDAO.save(customer);
		logger.debug("Customer details sent to DAO from service layer");
	}

	@Override
	public boolean checkLogin(String c_name, String c_pass) {
		logger.debug("Entered checkLogin() in CustomerServiceImpl");
		boolean status = customerDAO.checkLogin(c_name,c_pass);
		logger.debug("Customer Login checked and status sent to controller");
		return status;
	}

	@Override
	public Customer getCustomer(String name) {
		logger.debug("Entered getCustomer() in CustomerServiceImpl");
		logger.debug("Customer details recieved and sending to controller");
		return customerDAO.getCustomer(name);
	}

}
