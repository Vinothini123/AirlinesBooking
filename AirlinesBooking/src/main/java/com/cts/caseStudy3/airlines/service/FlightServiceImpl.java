package com.cts.caseStudy3.airlines.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.caseStudy3.airlines.dao.FlightDAO;
import com.cts.caseStudy3.airlines.model.Flight;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightDAO flightDAO;
	private static final Logger logger = LogManager.getLogger(FlightServiceImpl.class);
	
	@Override
	@Transactional
	public List<Flight> getAll() {
		logger.debug("Enter getAll() in FlightServiceImpl");
		logger.debug("Customer details recieved from DAO and sending to controller");
		return flightDAO.getAll();
	}

}
