<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="../img/favicon.ico" />
<title>Customer Home</title>

<!-- CSS only -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous">
    </script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous">
    </script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous">
    </script>
<!-- CSS -->
<link rel="stylesheet" href="resources/css/customerHome.css"
	type="text/css" />
</head>
<body>


	<nav id="main">
		<div class="logo" style="width: 100%; margin-left: auto; margin-right: auto;">
			<span style="font-size:30px;"> AIRLINES BOOKING</span>
			<span style="color:#fff; padding-left:50%;">Hello, ${sessionScope.customer.fname } ${sessionScope.customer.lname }</span>
			<span style="color:#fff;padding-left:5%;"><a href="logout">Logout</a></span>
		</div>
	</nav>

	<div class="background">

		<div class="cards-list">

			<div class="card 1">
				<div class="card_image">
					<img src="resources/img/book_flight.gif" />
				</div>
				<div class="card_title title-white">
					<section class="color-1">
						<nav class="cl-effect-20">
							<a href="bookingPage"><span data-hover="BOOK FLIGHT TICKET">BOOK FLIGHT TICKET</span></a>
						</nav>
					</section>
				</div>
			</div>

			<div class="card 2">
				<div class="card_image">
					<img src="resources/img/print_ticket.gif" width="100" height="100" />
				</div>
				<div class="card_title title-white">
					<section class="color-1">
						<nav class="cl-effect-20">
							<a href="printTicket"><span data-hover="PRINT TICKET">PRINT TICKET</span></a>
						</nav>
					</section>
				</div>
			</div>
			
			<div class="card 3">
				<div class="card_image">
					<img src="resources/img/printAllTicket.gif" width="100" height="100" />
				</div>
				<div class="card_title title-white">
					<section class="color-1">
						<nav class="cl-effect-20">
							<a href="printAllTickets"><span data-hover="PRINT ALL TICKETS">PRINT All TICKETS</span></a>
						</nav>
					</section>
				</div>
			</div>

		</div>
	</div>

</body>

</html>