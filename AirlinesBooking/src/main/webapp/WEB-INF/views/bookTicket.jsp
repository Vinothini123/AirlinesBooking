<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book your Ticket</title>
<!-- CSS -->
<link rel="stylesheet" href="resources/css/bookTicket.css"
	type="text/css" />
<script src="resources/js/bookTicket.js"></script>
</head>
<body>
<h1>FLIGHT TICKET BOOKING FORM</h1>
	<form>
	<table>
	<tr><td class="row1">
	<label>First name:</label><br>
		<input type="text" id="fname" name="c_fname" value="${sessionScope.customer.fname }" disabled><br>
		</td><td class="row1">
	<label>Last name:</label><br> 
		<input type="text" id="lname" name="lname" value="${sessionScope.customer.lname }" disabled><br>
		</td><td class="row1">
	<label>Phone number:</label><br> 
		<input type="text" id="phoneno" name="phoneno" value="${sessionScope.customer.phoneno }" disabled><br>
		</td></tr>
		<tr><td class="row2">
	<label>Email:</label><br> 
		<input type="email" id="email" name="email" value="${sessionScope.customer.email }" disabled><br>
		</td><td class="row2">
	<label>Aadhaar:</label><br> 
		<input type="text" id="aadhaar" name="aadhaar" value="${sessionScope.customer.aadhaar }" disabled><br>
		</td></tr></table>
		</form>
	
	<form action="bookFlightTicket" onsubmit="return validateForm()" method="post" modelAttribute="booking">
	<table><tr><td class="row2">
		<label>Choose your Flight:</label> 
			<select name="b_flightName" id="flights" onchange="calculateCost()">
			<c:forEach var="list" items="${form_list}">
				<option value="${list.flightName }">${list.flightName }</option>
				</c:forEach>
		</select><br> 
		</td><td class="row2">
		<label>Date:</label>
		<input type="date" id="datefield" name="journeyDate" onfocus="currentDate()"><br>
		</td><td class="row2">
		<label>Schedule:</label> 
			<select name="b_schedule" id="schedule">
			<c:forEach var="list" items="${form_list}">
				<option value="${list.schedule }">${list.schedule }</option>
				</c:forEach>
		</select><br> 
		</td></tr>
		<tr><td class="row3">
		<label>Departure Time:</label>
		<input type="time" id="dtime" name="b_dep_time"><br>
		</td><td class="row3">
		<label>Arrival Time:</label>
		<input type="time" id="atime" name="b_arr_time"><br>
		</td></tr>
		<tr><td class="row3">
		<label>Departure airport:</label> 
			<select name="b_dep_Port" id="dairport">
			<c:forEach var="list" items="${form_list}">
				<option value="${list.departurePort }">${list.departurePort }</option>
				</c:forEach>
		</select><br></td>
		<td class="row3">
		<label>Arrival airport:</label> 
			<select name="b_arr_Port" id="a_airport">
			<c:forEach var="list" items="${form_list}">
				<option value="${list.arrivalPort }">${list.arrivalPort }</option>
				</c:forEach>
		</select><br>
		</td></tr>
		<tr><td class="row3">
		<label>Select Class:</label> 
			<select name="b_class" id="flightClass" onchange="airport()">
			<c:forEach var="list" items="${form_list}">
				<option value="${list.flightClass }">${list.flightClass }</option>
				</c:forEach>
		</select><br></td> 
		<td class="row3">
		<label>Cost: Rs.</label>
		<input type="text" name="b_cost" id="cost" value="" readonly><br>
		</td></tr><tr><td class="row3">
		<label>Number of tickets</label>
		<input type="number" name="b_number" id="tickets" min="0"><br>
		</td><td class="row3">
		<label>Kids:</label> 
			<select name="b_kids" id="kids" onchange="calculateCost()">
				<option value="Yes">NA</option>
				<option value="No">No</option>
				<option value="NA">Yes</option>
		</select><br>
		</td></tr> 
		</table>
		<input type="submit" value="Submit">

	</form>
	
</body>

</html>