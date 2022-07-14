package com.cts.caseStudy3.airlines.service;

import java.util.List;

import com.cts.caseStudy3.airlines.model.Booking;

public interface BookingService {

	int generateBookingId();
	
	void bookTicket(Booking booking);
	
	List<Booking> getAllBookingByID(String fname);
	
	List<Booking> getBookingByflightAndSchedule(String flightName, String schedule);
	
	Booking getBookingByPNRandId(long PNR, String name);
	
	long createRandomNumber();
}
