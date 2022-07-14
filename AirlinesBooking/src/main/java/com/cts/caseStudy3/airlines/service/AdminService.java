package com.cts.caseStudy3.airlines.service;

import com.cts.caseStudy3.airlines.model.Admin;

public interface AdminService {
	
	boolean checkAdminLogin(String aname, String password);
	Admin getAdmin(String name);
}
