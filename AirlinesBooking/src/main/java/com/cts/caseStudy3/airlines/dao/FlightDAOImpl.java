package com.cts.caseStudy3.airlines.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.caseStudy3.airlines.constants.SQLconstants;
import com.cts.caseStudy3.airlines.model.Flight;

@Repository
public class FlightDAOImpl implements FlightDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	private static final Logger logger = LogManager.getLogger(FlightDAOImpl.class);
	
	@Override
	public List<Flight> getAll() {
		logger.debug("Entered getAll() in FlightDAOImpl");
		Session session = this.sessionFactory.getCurrentSession();
        List<Flight> allList = session.createQuery(SQLconstants.ALL_FLIGHTS).list();
        logger.debug("flight details fetched from DB and sending to service layer");
        return allList;
	}

}
