package com.cts.caseStudy3.airlines.dao;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.caseStudy3.airlines.constants.SQLconstants;
import com.cts.caseStudy3.airlines.model.Booking;

@Repository
public class BookingDAOImpl implements BookingDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LogManager.getLogger(BookingDAOImpl.class);
	
	@Transactional
	public void bookTicket(Booking booking) {
		logger.debug("Entered bookTicket() in BookindDAOImpl");
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(booking);
		logger.debug("Flight ticket details saved in DB");
	}
	
	@Override
	public int generateBookingId() {
		Random random = new Random();
		int min = 1000000000;
		int max = 209000000;
		return random.nextInt(max-min);
	}

	@Override
	public List<Booking> getAllBookingByID(String fname) {
		logger.debug("Entered getAllBookingByID() in BookingDAOImpl");
		Session session = sessionFactory.openSession();
		Query query= session.createQuery(SQLconstants.BOOKING_BY_ID);
		query.setParameter("fname", fname);
		List<Booking> bookingList = query.getResultList();
		logger.debug("Booking details fetched fromDB and sending to service layer");
		return bookingList;
	}
	
	public List<Booking> getBookingByflightAndSchedule(String flightName, String schedule) {
		logger.debug("Entered getBookingByflightAndSchedule() in BookingDAOImpl");
		Session session = sessionFactory.openSession();
		Query query= session.createQuery(SQLconstants.BOOKING_BY_SCHED_FLIGHT);
		query.setParameter("flightName", flightName);
		query.setParameter("schedule", schedule);
		List<Booking> bookingList = query.getResultList();
		logger.debug("Booking details fetched fromDB and sending to service layer");
		return bookingList;
	}
	
	public Booking getBookingByPNRandId(long PNR, String cname) {
		logger.debug("Entered getBookingByPNRandId() in BookingDAOImpl");
		Session session = sessionFactory.openSession();
		Query query= session.createQuery(SQLconstants.BOOKING_BY_PNR_ID);
		query.setParameter("PNR", PNR);
		query.setParameter("cname", cname);
		Booking booking = (Booking) query.uniqueResult();
		logger.debug("Booking details fetched fromDB and sending to service layer");
		return booking;
	}

}
