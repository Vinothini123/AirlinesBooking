<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>AdminHome</title>
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Ubuntu:wght@500&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="resources/css/admin.css" type="text/css"/>
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
</body>
</html>