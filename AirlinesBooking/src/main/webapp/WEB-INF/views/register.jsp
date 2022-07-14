<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration</title>
<link
  href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&family=Ubuntu:wght@500&display=swap"
  rel="stylesheet">
<link rel="stylesheet"
  href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
  integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
  crossorigin="anonymous">
<link rel="stylesheet" href="resources/css/styles.css" type="text/css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

</head>
<body>
  <nav>
    <div class="logo">
      <p>AIRLINES BOOKING</p>
    </div>

    <ul>
      <li><a href="/airlines/">Log In</a></li>

    </ul>
  </nav>

  <div class="background">
    <div class="blur"></div>
  </div>


<form class="btn" action="/airlines/addCustomer" method="post" modelAttribute="customer" >
    <table>
      <h8 style="color: red;">Fields marked with (*) are mandatory</h8>
      <br>
      <tr>
        <td><label for="fname">First Name<span
            style="color: red;">*</span></label><br> <input type="text" maxlength="100"
          id="fname" name="fname" placeholder="First Name" title="Must have characters <=100" required><br>
        </td>
        <td><label for="lname">Last Name:</label><br> <input
          type="text" maxlength="100" id="lname" name="lname" title="Must have characters <=100" placeholder="Last Name" required><br>
        </td>
      </tr>
      <tr>
        <td><label for="Phone">Phone Number<span
            style="color: red;">*</span></label><br> <input  type="text"
          id="number" name="phoneno" placeholder="Phone Number" pattern="[6-9]{1}[0-9]{9}" title="Must Be Ten Number and Start With 6or7or8or9" required> <br>
        </td>
        <td><label for="lname">Address:</label><br> <input
          type="text" id="address" name="address"
          placeholder="Address" required><br></td>
             </tr>
      <tr>
      <td><label for="Phone">Aadhaar Number<span
            style="color: red;">*</span></label><br> <input  type="text"
          id="aadhaar" name="aadhaar" placeholder="Aadhaar Number" maxlength="20" required> <br>
        </td>
        <td><label for="password">Password<span
            style="color: red;">*</span></label><br> <input  type="password"
          name="password" id="password" placeholder="Password" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$" title="Must Contain a Uppercase,Lowercase,Number and 8 Charater and a special character"  required> <br></td>
 
      </tr>
      <tr>
        
        <td><label for="email">Email<span style="color: red;">*</span></label><br>
          <input type="email" name="email" id="email" placeholder="Email" required>
          <br></td>
          <td><label for="password">Confirm Password<span
            style="color: red;">*</span></label><br> <input  type="password"
          name="confirm_password" id="confirm_password" placeholder="Confirm Password" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$" title="Must be same as Password"  required>
           <br></td>
      </tr>
    </table><br>
    <p id="warn"></p>
    <a href="/airlines/" style="text-decoration: underline; color: #000000;">Already have Account</a>
    <br> <br> <input id="button" type="submit" value="Submit"/>

  </form>
  
  <div id="bottom-container">


    <p class="ftext">Copyright @ AIRLINES BOOKING</p>



  </div>
  <script>
  
  $('#password, #confirm_password').on('keyup', function () {
	    if ($('#password').val() == $('#confirm_password').val()) {
	        $('#warn').html('Matching').css('color', 'green');
	    } else 
	        $('#warn').html('Not Matching').css('color', 'red');
	});
  </script>

</body>
</html>