package com.cts.caseStudy3.airlines.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.caseStudy3.airlines.dao.BookingDAO;
import com.cts.caseStudy3.airlines.model.Booking;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingDAO bookingDAO;
	
	private static final Logger logger = LogManager.getLogger(BookingServiceImpl.class); 
	
	@Override
	public int generateBookingId() {
		return bookingDAO.generateBookingId();
	}

	@Override
	public void bookTicket(Booking booking) {
		logger.debug("Entered bookTicket() in BookingServiceImpl");
		logger.debug("Ticket details sent to DAO layer");
		bookingDAO.bookTicket(booking);
	}

	@Override
	public List<Booking> getAllBookingByID(String fname) {
		logger.debug("Entered getAllBookingByID() in BookingServiceImpl");
		logger.debug("Booking details sent to controller from service layer");
		return bookingDAO.getAllBookingByID(fname);
	}

	@Override
	public List<Booking> getBookingByflightAndSchedule(String flightName, String schedule) {
		logger.debug("Entered getBookingByflightAndSchedule() in BookingServiceImpl");
		logger.debug("Booking details sent to controller from service layer");
		return bookingDAO.getBookingByflightAndSchedule(flightName, schedule);
	}

	@Override
	public Booking getBookingByPNRandId(long PNR, String cname) {
		logger.debug("Entered getBookingByPNRandId() in BookingServiceImpl");
		logger.debug("Booking details sent to controller from service layer");
		return bookingDAO.getBookingByPNRandId(PNR, cname);
	}

	@Override
	public long createRandomNumber() {
		logger.debug("Entered createRandomNumber() in BookingServiceImpl");
		long len = 10;
		long tLen = (long) Math.pow(10, len - 1) * 9;

	    long number = (long) (Math.random() * tLen) + (long) Math.pow(10, len - 1) * 1;
	    logger.debug("PNR number successfully generated and sent to controller");
	    return number;
	}

}
