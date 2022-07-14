function validateForm() {
	var a = document.getElementById("flights").value;
	var b = document.getElementById("datefield").value;
	var c = document.getElementById("schedule").value;
	var d = document.getElementById("dtime").value;
	var e = document.getElementById("atime").value;
	var f = document.getElementById("dairport").value;
	var g = document.getElementById("a_airport").value;
	var h = document.getElementById("flightClass").value;
	var i = document.getElementById("tickets").value;
	var j = document.getElementById("kids").value;
	if (a == "") {
		alert("Choose your flight !");
		return false;
	}
	if (b == "") {
		alert("Journey Date must be selected");
		return false;
	}
	if (c == "") {
		alert("Schedule to fly must be selected");
		return false;
	}
	if (d == "") {
		alert("Departure time must be selected");
		return false;
	}
	if (e == "") {
		alert("Arrival time must be selected");
		return false;
	}
	if (f == "") {
		alert("Departure airport must be selected");
		return false;
	}
	if (g == "") {
		alert("Arrival airport must be selected");
		return false;
	}
	if (h == "") {
		alert("Flight Class must be selected");
		return false;
	}
	if (i == "") {
		alert("Enter the Number of Tickets !");
		return false;
	}
	if (j == "") {
		alert("Status of Kids must be selected");
		return false;
	} else {
		alert("Values sent to the server ! ! !")
	}
}

function currentDate() {
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth() + 1; //January is 0 so need to add 1 to make it 1!
	var yyyy = today.getFullYear();
	if (dd < 10) {
		dd = '0' + dd
	}
	if (mm < 10) {
		mm = '0' + mm
	}

	today = yyyy + '-' + mm + '-' + dd;
	document.getElementById("datefield").setAttribute("min", today);
}

function airport() {
	if ((document.getElementById('dairport').value) === (document.getElementById('a_airport').value)) {
		alert('Departure and Arrival airport should not be same');
	}
}

function calculateCost() {
	var val = 0;
	const flights = document.getElementById("flights").value;
	const flightClass = document.getElementById("flightClass").value;
	var departPort = document.getElementById("dairport").value;
	var arrPort = document.getElementById("a_airport").value;
	let noOfTickets = document.getElementById("tickets").value;
	if (flights === "Air India") {
		val = 5000;
	} else if (flights === "Emirates") {
		val = 8000;
	} else if (flights === "Indigo Airlines") {
		val = 4000;
	} else if (flights === "SpiceJet") {
		val = 4500;
	} else {
		val = 6000;
	}
	if (flightClass === "Business") {
		val += 3000;
	} else {
		val += 500;
	}
	val = val * noOfTickets;
	if ((departPort === "Paris" && arrPort === "Chennai") || (departPort === "Chennai" && arrPort === "Paris")) {
		val += 70000;
	} else if ((departPort === "Paris" && arrPort === "Bangalore") || (departPort === "Bangalore" && arrPort === "Paris")) {
		val += 60000;
	} else if ((departPort === "Paris" && arrPort === "Mumbai") || (departPort === "Mumbai" && arrPort === "Paris")) {
		val += 50000;
	} else if ((departPort === "Paris" && arrPort === "London") || (departPort === "London" && arrPort === "Paris")) {
		val += 8000;
	} else if ((departPort === "Chennai" && arrPort === "London") || (departPort === "London" && arrPort === "Chennai")) {
		val += 90000;
	} else if ((departPort === "Chennai" && arrPort === "Mumbai") || (departPort === "Mumbai" && arrPort === "Chennai")) {
		val += 9000;
	} else if ((departPort === "Chennai" && arrPort === "Bangalore") || (departPort === "Bangalore" && arrPort === "Chennai")) {
		val += 5000;
	} else if ((departPort === "Mumbai" && arrPort === "London") || (departPort === "London" && arrPort === "Mumbai")) {
		val += 100000;
	} else if ((departPort === "Mumbai" && arrPort === "Bangalore") || (departPort === "Bangalore" && arrPort === "Mumbai")) {
		val += 5000;
	} else if ((departPort === "Bangalore" && arrPort === "London") || (departPort === "Chennai" && arrPort === "London")) {
		val += 120000;
	}
	document.getElementById("cost").value = val;
}
function validateTime() {
	var deptime = new Time(document.getElementById("dtime").value);
	var arrtime = new Time(document.getElementById("atime").value);
	if (arrtime === deptime) {
		alert("Departure time and Arrival time should not be same XXX");
	}
}

