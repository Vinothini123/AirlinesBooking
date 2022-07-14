package com.cts.caseStudy3.airlines.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.caseStudy3.airlines.constants.TxtConstants;
import com.cts.caseStudy3.airlines.model.Customer;
import com.cts.caseStudy3.airlines.service.CustomerService;


/*
 *RegisterController class consists several methods perform operations based
 *on action calls returns view page along with model attribute  
*/
@Controller
public class RegisterController {

	@Autowired
	CustomerService customerService;

	public static final Logger logger = LogManager.getLogger(RegisterController.class);
	
	/*
	 * Method to display register.jsp
	 * 
	 * @param 
	 * @return String - view page
	*/
	@RequestMapping("/register")
	public String register() {
		logger.debug("Entered register() in controller to fix register.jsp view page");
		logger.debug("register.jsp fixed as view successfully");
		return TxtConstants.REGISTER;
	}

	/*
	 * Method to save the customer details in DB and to display login.jsp based on the result
	 * 
	 * @param Customer customer
	 * @return String - view page
	*/
	@PostMapping("/addCustomer")
	public String registerCustomer(@ModelAttribute("customer") Customer customer) {
		logger.debug("Entered registerCustomer() in controller with form inputs");
		customerService.save(customer);
		logger.info("New customer registered successfully!");
		logger.debug("New customer registered successfully and opened login.jsp");
		return TxtConstants.LOGIN;
	}
}
