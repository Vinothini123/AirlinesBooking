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
import com.cts.caseStudy3.airlines.model.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	private static final Logger logger = LogManager.getLogger(AdminDAOImpl.class); 

	@Override
	public boolean checkAdminLogin(String aname, String password) {
		logger.debug("Entered checkAdminLogin() in AdminDAOImpl");
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY = SQLconstants.ADMIN_LOGIN;
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,aname);
		query.setParameter(1,password);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		logger.debug("Admin login credentials checked and sending staus to service layer");
		return userFound;              
	}
	@Transactional
	public Admin getAdmin(String name) {
		logger.debug("Entered getAdmin() in AdminDAOImpl");
		Session session = sessionFactory.openSession();
		Query query= session.createQuery(SQLconstants.GET_ADMIN);
		query.setParameter("name", name);
		Admin admin = (Admin) query.uniqueResult();
		logger.debug("Admin details retrieved from DB and sent to service layer");
		return admin;
	}

}
