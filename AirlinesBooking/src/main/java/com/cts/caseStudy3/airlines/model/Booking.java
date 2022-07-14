package com.cts.caseStudy3.airlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "bookingID", nullable = false)
	private int bookingID;
	
	@Column(name = "PNR", unique=true)
	private long PNR;
	
	@Column(name = "c_fname")
	private String c_fname;
	
	@Column(name = "b_flightName")
	private String b_flightName;
	
	@Column(name = "journeyDate")
	private String journeyDate;
	
	@Column(name = "b_schedule")
	private String b_schedule;
	
	@Column(name = "b_dep_time")
	private String b_dep_time;

	@Column(name = "b_arr_time")
	private String b_arr_time;

	@Column(name = "b_dep_Port")
	private String b_dep_Port;

	@Column(name = "b_arr_Port")
	private String b_arr_Port;
	
	@Column(name = "b_class")
	private String b_class;
	
	@Column(name = "b_cost")
	private int b_cost;

	@Column(name = "b_number")
	private int b_number;
	
	@Column(name = "b_kids")
	private String b_kids;

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public long getPNR() {
		return PNR;
	}

	public void setPNR(long pNR) {
		PNR = pNR;
	}

	public String getC_fname() {
		return c_fname;
	}

	public void setC_fname(String c_fname) {
		this.c_fname = c_fname;
	}

	public String getB_flightName() {
		return b_flightName;
	}

	public void setB_flightName(String b_flightName) {
		this.b_flightName = b_flightName;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getB_schedule() {
		return b_schedule;
	}

	public void setB_schedule(String b_schedule) {
		this.b_schedule = b_schedule;
	}

	public String getB_dep_time() {
		return b_dep_time;
	}

	public void setB_dep_time(String b_dep_time) {
		this.b_dep_time = b_dep_time;
	}

	public String getB_arr_time() {
		return b_arr_time;
	}

	public void setB_arr_time(String b_arr_time) {
		this.b_arr_time = b_arr_time;
	}

	public String getB_dep_Port() {
		return b_dep_Port;
	}

	public void setB_dep_Port(String b_dep_Port) {
		this.b_dep_Port = b_dep_Port;
	}

	public String getB_arr_Port() {
		return b_arr_Port;
	}

	public void setB_arr_Port(String b_arr_Port) {
		this.b_arr_Port = b_arr_Port;
	}

	public String getB_class() {
		return b_class;
	}

	public void setB_class(String b_class) {
		this.b_class = b_class;
	}

	public int getB_cost() {
		return b_cost;
	}

	public void setB_cost(int b_cost) {
		this.b_cost = b_cost;
	}

	public int getB_number() {
		return b_number;
	}

	public void setB_number(int b_number) {
		this.b_number = b_number;
	}

	public String getB_kids() {
		return b_kids;
	}

	public void setB_kids(String b_kids) {
		this.b_kids = b_kids;
	}

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", PNR=" + PNR + ", c_fname=" + c_fname + ", b_flightName="
				+ b_flightName + ", journeyDate=" + journeyDate + ", b_schedule=" + b_schedule + ", b_dep_time="
				+ b_dep_time + ", b_arr_time=" + b_arr_time + ", b_dep_Port=" + b_dep_Port + ", b_arr_Port="
				+ b_arr_Port + ", b_class=" + b_class + ", b_cost=" + b_cost + ", b_number=" + b_number + ", b_kids="
				+ b_kids + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
