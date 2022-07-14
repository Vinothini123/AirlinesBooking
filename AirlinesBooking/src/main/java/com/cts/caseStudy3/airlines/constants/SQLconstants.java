package com.cts.caseStudy3.airlines.constants;

public class SQLconstants {

	//ADMIN
	public static final String ADMIN_LOGIN = "from Admin where a_fname=? and a_password=?";
	public static final String GET_ADMIN = "from Admin where a_fname=:name";
	
	//CUSTOMER
	public static final String CUSTOMER_LOGIN = "from Customer where fname=? and password=?";
	public static final String GET_CUSTOMER = "from Customer where fname=:name";
	
	//BOOKING
	public static final String BOOKING_BY_ID = "from Booking where c_fname=:fname";
	public static final String BOOKING_BY_SCHED_FLIGHT = "from Booking where b_flightName=:flightName and b_schedule=:schedule";
	public static final String BOOKING_BY_PNR_ID = "from Booking where PNR=:PNR and c_fname=:cname";
	
	//FLIGHT
	public static final String ALL_FLIGHTS = "from Flight";
}
