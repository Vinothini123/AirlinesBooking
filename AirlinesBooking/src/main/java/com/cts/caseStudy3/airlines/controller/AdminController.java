package com.cts.caseStudy3.airlines.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.caseStudy3.airlines.constants.TxtConstants;
import com.cts.caseStudy3.airlines.model.Booking;
import com.cts.caseStudy3.airlines.model.Flight;
import com.cts.caseStudy3.airlines.service.BookingService;
import com.cts.caseStudy3.airlines.service.FlightService;

/*
 *AdminController class consists several methods perform operations based
 *on action calls returns view page along with model attribute  
*/
@Controller
public class AdminController {
	
	@Autowired
	FlightService flightService;
	
	@Autowired
	BookingService bookingService;
	
	public static final Logger logger = LogManager.getLogger(AdminController.class);
	
	/*
	 * Method to display adminHome.jsp along with pre-populated details taken
	 * from the database
	 * 
	 * @param HttpSession session, ModelAndView mv
	 * @return ModelAndView - view page & object
	*/
	@RequestMapping("/adminHome")
	public ModelAndView showAdminHome(HttpSession session, ModelAndView mv) {
		logger.debug("Entered showAdmin() in AdminController");
		List<Flight> form_list = flightService.getAll();
		mv.addObject("form_list",form_list);
		mv.setViewName(TxtConstants.ADMIN_HOME);
		logger.debug("adminHome.jsp along with prepopulated details of flights are fixed");
		return mv;
	}
	
	/*
	 * Method to display admin.jsp along with pre-populated details taken from the 
	 * database and also to display the list of flights based on inputs
	 * 
	 * @param HttpSession session, ModelAndView mv, String flightName, String flightSchedule
	 * @return ModelAndView - view page & object
	*/
	@PostMapping("/getTable")
	public ModelAndView showTableValues(@RequestParam("flight") String flightName, @RequestParam("schedule") String flightSchedule, HttpSession session, ModelAndView mv ) {
		logger.debug("EnteredshowTableValues() in AdminController");
		List<Booking> bookings = bookingService.getBookingByflightAndSchedule(flightName, flightSchedule);
		List<Flight> form_list = flightService.getAll();
		mv.addObject("form_list",form_list);
		mv.addObject("bookings",bookings);
		mv.setViewName(TxtConstants.ADMIN);
		logger.debug("admin.jsp and booking details are fixed as model and view");
		return mv;
	}
}
