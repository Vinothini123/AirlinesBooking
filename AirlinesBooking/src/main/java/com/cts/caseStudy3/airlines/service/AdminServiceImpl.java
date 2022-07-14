package com.cts.caseStudy3.airlines.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.caseStudy3.airlines.dao.AdminDAO;
import com.cts.caseStudy3.airlines.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDAO adminDAO;

	private static final Logger logger = LogManager.getLogger(AdminServiceImpl.class);
	
	@Override
	public boolean checkAdminLogin(String aname, String password) {
		logger.debug("Entered checkAdminLogin() in AdminServiceImpl");
		boolean status = adminDAO.checkAdminLogin(aname, password);
		logger.debug("Admin login checked from service and returning the result to controller");
		return status;
	}

	@Override
	public Admin getAdmin(String name) {
		logger.debug("Entered getAdmin() in AdminServieImpl");
		logger.debug("Admin details fetched to service and returning to controller");
		return adminDAO.getAdmin(name);
	}

}
