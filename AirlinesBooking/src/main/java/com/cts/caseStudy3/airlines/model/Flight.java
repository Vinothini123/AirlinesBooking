package com.cts.caseStudy3.airlines.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "f_id", nullable = false)
	private int f_id;
	
	@Column(name = "flightName")
	private String flightName;
	
	@Column(name = "schedule")
	private String schedule;
	
	@Column(name = "departurePort")
	private String departurePort;
	
	@Column(name = "arrivalPort")
	private String arrivalPort;
	
	@Column(name = "flightClass")
	private String flightClass;

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}

	public String getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public String getFlightClass() {
		return flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	@Override
	public String toString() {
		return "Flight [f_id=" + f_id + ", flightName=" + flightName + ", schedule=" + schedule + ", departurePort="
				+ departurePort + ", arrivalPort=" + arrivalPort + ", flightClass=" + flightClass + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
