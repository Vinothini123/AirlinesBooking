<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.cts.caseStudy3.airlines.model.Booking"%>
<!DOCTYPE html>
<html>
<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/admin.css" type="text/css"/>
<title>Air Tickets</title>
</head>
<body>
	<nav>
        <div class="logo">
           <p>AIRLINES BOOKING</p>
           <ul>
           <li><a href="logout">Logout</a></li>
           </ul>
        </div>
    </nav>
	<form action="getTable" method="post">
		<label>Choose a Flight:</label> <select name="flight" id="flight">
			<c:forEach var="list" items="${form_list}">
				<option value="${list.flightName }">${list.flightName }</option>
			</c:forEach>
		</select>
		<label>Choose a schedule:</label> <select name="schedule" id="schedule">
			<c:forEach var="list" items="${form_list}">
				<option value="${list.schedule }">${list.schedule }</option>
			</c:forEach>
		</select>
		<input type="submit" value="Submit">
	</form>

	<div class="col-md-12">
		<table class="table table-bordered"
			style="margin-left: auto; margin-right: auto;">
			<thead class="bg-light">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">PNR</th>
					<th scope="col">JOURNEY</th>
					<th scope="col">NAME</th>
					<th scope="col">FLIGHT</th>
					<th scope="col">CLASS</th>
					<th scope="col">DEPARTURE PORT</th>
					<th scope="col">DEPARTURE TIME</th>
					<th scope="col">ARRIVAL PORT</th>
					<th scope="col">ARRIVAL TIME</th>
					<th scope="col">KIDS</th>
					<th scope="col">TICKETS</th>
					<th scope="col">COST</th>
				</tr>
			</thead>
			<c:forEach var="list" items="${bookings}">
				<tbody>
						<tr>
							<td>${list.bookingID }</td>
							<td>${list.PNR }</td>
							<td>${list.journeyDate }</td>
							<td>${list.c_fname }</td>
							<td>${list.b_flightName }</td>
							<td>${list.b_class }</td>
							<td>${list.b_dep_Port }</td>
							<td>${list.b_dep_time }</td>
							<td>${list.b_dep_time }</td>
							<td>${list.b_arr_time }</td>
							<td>${list.b_kids }</td>
							<td>${list.b_number }</td>
							<td>Rs.${list.b_cost }</td>
						</tr>
				</tbody>
			</c:forEach>
		</table>
	</div>
</body>
</html>