package com.cts.caseStudy3.airlines.dao;

import java.util.List;

import com.cts.caseStudy3.airlines.model.Booking;

public interface BookingDAO {
	public int generateBookingId();
	
	public void bookTicket(Booking booking);
	
	public List<Booking> getAllBookingByID(String fname);
	
	public List<Booking> getBookingByflightAndSchedule(String flightName, String schedule);
	
	public Booking getBookingByPNRandId(long PNR, String cname);
}
