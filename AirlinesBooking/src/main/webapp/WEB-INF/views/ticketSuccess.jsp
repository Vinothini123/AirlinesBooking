<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.cts.caseStudy3.airlines.model.Booking"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Success</title>
<style>
table {
  font-family: arial, sans-serif;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

.first{
	width:40%;
}
tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<h2>Congratulations! you have booked your flight tickets successfully!</h2>
<a href="customerHome"><button>Customer Home Page</button></a>

<table>
  <tr>
    <th class="first">Ticket</th>
    <th>Details</th>
  </tr>
  <tr>
    <td class="first">Booking ID</td>
    <td>${booking.bookingID }</td>
  </tr>
  <tr>
    <td class="first">PNR</td>
    <td>${booking.PNR }</td>
  </tr>
  <tr>
    <td class="first">Customer Name</td>
    <td>${booking.c_fname }</td>
  </tr>
  <tr>
    <td class="first">Journey Date</td>
    <td>${booking.journeyDate }</td>
  </tr>
  <tr>
    <td class="first">Schedule</td>
    <td>${booking.b_schedule }</td>
  </tr>
  <tr>
    <td class="first">Flight Name</td>
    <td>${booking.b_flightName }</td>
  </tr>
  <tr>
    <td class="first">Class</td>
    <td>${booking.b_class }</td>
  </tr>
  <tr>
    <td class="first">Departure Port</td>
    <td>${booking.b_dep_Port }</td>
  </tr>
  <tr>
    <td class="first">Departure time</td>
    <td>${booking.b_dep_time }</td>
  </tr>
  <tr>
    <td class="first">Arrival Port</td>
    <td>${booking.b_arr_Port }</td>
  </tr>
  <tr>
    <td class="first">Arrival time</td>
    <td>${booking.b_arr_time }</td>
  </tr>
  <tr>
    <td class="first">Kids</td>
    <td>${booking.b_kids }</td>
  </tr>
  <tr>
    <td class="first">Number of Tickets</td>
    <td>${booking.b_number }</td>
  </tr>
  <tr>
    <td class="first">Cost</td>
    <td>Rs.${booking.b_cost }</td>
  </tr>
</table>
</body>
</html>