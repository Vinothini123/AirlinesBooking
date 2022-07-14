package com.cts.caseStudy3.airlines.dao;

import com.cts.caseStudy3.airlines.model.Admin;

public interface AdminDAO {
	
	public boolean checkAdminLogin(String aname, String password);
	public Admin getAdmin(String name);
}
