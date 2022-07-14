package com.cts.caseStudy3.airlines.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.caseStudy3.airlines.constants.TxtConstants;
import com.cts.caseStudy3.airlines.model.Booking;
import com.cts.caseStudy3.airlines.model.Customer;
import com.cts.caseStudy3.airlines.model.Flight;
import com.cts.caseStudy3.airlines.service.BookingService;
import com.cts.caseStudy3.airlines.service.FlightService;

/*
 *CustomerHomeController class consists several methods perform operations based
 *on action calls returns view page along with model attribute  
*/
@Controller
public class CustomerHomeController {
	
	@Autowired
	FlightService flightService;
	
	@Autowired
	BookingService bookingService;
	int ran = 1132349582;
	
	public static final Logger logger = LogManager.getLogger(CustomerHomeController.class);

	/*
	 * Method to display customerHome.jsp
	 * 
	 * @param HttpSession session
	 * @return String - view page
	*/
	@RequestMapping("/customerHome")
	public String viewCustomerHome(HttpSession session) {
		logger.debug("Entered viewCustomerHome() in CustomerHomeController");
		logger.debug("customerHome.jsp fixed as view successfully");
		return TxtConstants.CUSTOMER_HOME;
	}

	/*
	 * Method to display bookTicket.jsp along with pre-populated details taken
	 * from the database
	 * 
	 * @param HttpSession session, ModelAndView mv
	 * @return ModelAndView - object & view page
	*/
	@RequestMapping("/bookingPage")
	public ModelAndView displayTicketForm(HttpServletResponse response, ModelAndView mv) {
		logger.debug("Entered displayTicketForm() in CustomerHomecontroller");
		List<Flight> form_list = flightService.getAll();
		mv.addObject("form_list",form_list);
		mv.setViewName(TxtConstants.BOOK_TICKET);
		logger.debug("Booking form opened with prepopulated details!");
		return mv;
	}
	
	/*
	 * Method to book the ticket based on the inputs and display ticketSuccess.jsp along
	 * with booking details taken from the database
	 * 
	 * @param HttpSession session, ModelAndView mv, Booking booking
	 * @return ModelAndView - object & view page
	*/
	@PostMapping("/bookFlightTicket")
	public ModelAndView bookTicket(@ModelAttribute("booking") Booking booking, HttpSession session, ModelAndView mv) {
		logger.debug("Entered bookTicket() in CustomerHomeController");
		Customer customer = (Customer) session.getAttribute("customer");
		booking.setC_fname(customer.getFname());
		long pnr = bookingService.createRandomNumber();
		booking.setPNR(pnr);
		bookingService.bookTicket(booking);
		mv.addObject("booking",booking);
		mv.setViewName(TxtConstants.TICKET_SUCCESS);
		logger.info("Flight Ticketd booked successfully");
		logger.debug("Flight tickets booked and details sent to ticketSuccess.jsp as view");
		return mv;
	}
	
	/*
	 * Method to display printTicket.jsp 
	 * 
	 * @param 
	 * @return String - view page
	*/
	@RequestMapping("/printTicket")
	public String viewPrintTicket() {
		logger.debug("Entered viewPrintTicket() in CustomerHomeController");
		logger.debug("printTicket.jsp fixed as view successfully");
		return TxtConstants.PRINT_TICKET;
	}
	
	/*
	 * Method to display printTicket.jsp along with booking details taken from the database
	 * based on the input
	 * 
	 * @param HttpSession session, ModelAndView mv, Booking booking, long pnr
	 * @return ModelAndView - object & view page
	*/
	@PostMapping("/printTicket")
	public ModelAndView printTicket(@RequestParam("PNR") long pnr, HttpSession session,  ModelAndView mv) {
		logger.debug("Entered printTicket() in CustomerHomeController");
		Customer customer = (Customer) session.getAttribute("customer");
		Booking booking = bookingService.getBookingByPNRandId(pnr, customer.getFname());
		mv.addObject("booking",booking);
		mv.setViewName(TxtConstants.PRINT_TICKET);
		logger.debug("printTicket.jsp along with booking details on PNR is fixed as model and view");
		return mv;
	}
	
	/*
	 * Method to display printAllTickets.jsp along with booking details taken from the database
	 * 
	 * @param HttpSession session, ModelAndView mv
	 * @return ModelAndView - object & view page
	*/
	@RequestMapping("/printAllTickets")
	public ModelAndView printAllTickets(HttpSession session, ModelAndView mv) {
		logger.debug("Entered printAllTickets() in CustomerHomeController");
		Customer customer = (Customer) session.getAttribute("customer");
		List<Booking> bookingList = bookingService.getAllBookingByID(customer.getFname());
		mv.addObject("bookingList",bookingList);
		mv.setViewName(TxtConstants.PRINT_ALL_TICKETS);
		logger.debug("printAllTickets.jsp and booking list fixed as model and view");
		return mv;
	}
}
