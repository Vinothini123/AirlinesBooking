package com.cts.caseStudy3.airlines.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.caseStudy3.airlines.constants.SQLconstants;
import com.cts.caseStudy3.airlines.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger logger = LogManager.getLogger(CustomerDAOImpl.class);

	@Override
	@Transactional
	public void save(Customer customer) {
		logger.debug("Entered save() in CustomerDAOImpl");	
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(customer);
		logger.debug("Customer details saved in DB");
	}
	
	@Transactional
	public boolean checkLogin(String c_name, String c_pass){
		logger.debug("Entered checkLogin() in CustomerDAOImpl");
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY = SQLconstants.CUSTOMER_LOGIN;
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,c_name);
		query.setParameter(1,c_pass);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		logger.debug("Customer credentials checked and sending status to service layer");
		return userFound;              
   }
	
	@Transactional
	public Customer getCustomer(String name) {
		logger.debug("Entered getCustomer() in CustomerDAOImpl");
		Session session = sessionFactory.openSession();
		Query query= session.createQuery(SQLconstants.GET_CUSTOMER);
		query.setParameter("name", name);
		Customer customer = (Customer) query.uniqueResult();
		logger.debug("Customer details fetched from DB and sending to service layer");
		return customer;
	}
	
}
