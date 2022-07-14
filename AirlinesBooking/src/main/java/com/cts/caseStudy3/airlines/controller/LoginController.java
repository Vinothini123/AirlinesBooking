package com.cts.caseStudy3.airlines.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.caseStudy3.airlines.constants.TxtConstants;
import com.cts.caseStudy3.airlines.model.Admin;
import com.cts.caseStudy3.airlines.model.Customer;
import com.cts.caseStudy3.airlines.service.AdminService;
import com.cts.caseStudy3.airlines.service.CustomerService;

/*
 *LoginController class consists several methods perform operations based
 *on action calls returns view page along with model attribute  
*/
@Controller
public class LoginController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	AdminService adminService;
	
	private static final Logger logger = LogManager.getLogger(LoginController.class);

	/*
	 * Method to display login.jsp
	 * 
	 * @param HttpServletResponse response
	 * @return String - view page
	*/
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) {
		return new ModelAndView(TxtConstants.LOGIN);
	}
	
	/*
	 * Method to check login and to display the required view page based on result
	 * 
	 * @param HttpSession session, Model mode, String cus_name, String cus_pass
	 * @return String - view page
	*/
	@PostMapping("/login")
	public String login_customer(@RequestParam("uname") String cus_name, @RequestParam("password") String cus_pass, HttpSession session, Model model) {
		logger.debug("Enter login() in controller and Checking login");
		if(customerService.checkLogin(cus_name, cus_pass)) {
			logger.info("Customer login checked !");
			Customer customer = customerService.getCustomer(cus_name);
			session.setAttribute("customer", customer);
			logger.info("Customer session checked !");
			logger.debug("Customer login successfull");
			return TxtConstants.CUSTOMER_HOME;
		}
		else if(adminService.checkAdminLogin(cus_name, cus_pass)){
			logger.info("Admin login checked !");
			Admin admin = adminService.getAdmin(cus_name);
			session.setAttribute("admin", admin);
			logger.debug("Admin login successfull");
			return "redirect:/adminHome";
		}
		else {
			logger.info("Invalid credentials provided");
			model.addAttribute("error", "Wrong Credentials!!!");
			logger.debug("Login Failed! Invalid credentials entered");
			return TxtConstants.LOGIN;
		}
	}
	
	/*
	 * Method to logout from current session and display login.jsp
	 * 
	 * @param HttpServletResponse response
	 * @return String - view page
	*/
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		logger.debug("Entered logout controller");
		HttpSession session = request.getSession();
		session.invalidate();
		logger.info("User session closed and logged out successfully.");
		return "redirect:/";
	}
}
