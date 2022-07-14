# AirlinesBooking
Airlines Booking using Spring MVC and Hibernate


## _Pre-Requisite_
     Develop the projects in Spring MVC + Maven
     Backend framework should be Hibernate.
     Java Based or XML Based configuration
     Table name alone is given in the requirement if required you can introduce any tables or column as required
     Use any DB for Database operations
     Handle Exception and loggers efficiently
     Handle it with POJO Class to display details
     CSS should be handled professionally

## _Functional Requirement_
     Login Page  
     Customers Entry Creation 
     Book a Flight Ticket 
     Print the booked Flight tickets 
     For Airlines officials, List all the Flight tickets booked for the entire day in 4 different schedules 

## Requirement 1: Login Page
- Login Page should contain User ID, Password field and Create Account link for new Customer
- Based on the login User id ,System should identify whether the User is Airlines officials or Customer
- User id should be validated in the server end.
- USR table should hold all the Airlines officials details.
- CUSTMR table should contain all the existing customer details.
- If the User click the Create Account link then redirect to new Page where below fields should be displayed

    - _Customer First Name (Validate 100 char)_
    - _Customer last Name(Validate 100 char)_
    - _Phone Number (Validate 10  char and for alpha special char)_
    - _Address_
    - _Aadhar Number(Validate for 20 char)_
    - _Password_
    - _Confirm Password (Should validate against Password field)_
    - _Email(Validate for format)_
    - _All the above fields are mandatory fields_ 
- On submitting form ,insert the record in CUSTMR table and redirect to login page again_
- If the logged in user is the Customer then display below link
     - _Book a Flight Ticket (Separate Page)_ 
     - _Print the booked Flight tickets (Separate Page)_
- If the logged in user is the Airlines Official then display below link     
     - _Print the booked Flight tickets (Separate Page)_
     - _For Airlines officials, List all the Flight tickets booked for the entire day in 4 different schedules (Separate Page to display 4 different schedule in 4 different table)_


## Requirement 2: Book a Flight Ticket
- This page should pre-populate the Customer details when he/she logged in like First Name, Last Name, Phone Number, Email id, Aadhar card and also should contain below details 
    - _Flight list dropdown_
    - _Date calendar(validate past date)_
	  - _Schedule drop down(7 am,10 am,2pm,5 pm) (Validate past schedule)_
	  - _depature time & arrival time_
	  - _Departure airport drop down_
	  - _Arival airport drop down_
	  - _Type of class (Business/Economy)_
	  - _Cost_
	  - _Number of tickets_
	  - _Kids if any (Yes,No,NA)_
- All mandatory fields if not applicable then select NA. Store all the flight details in the FLIGHT table
- On submitting form, booking ID and PNR id should be displayed in the new page
- Captue all the booking details in the BOOKING table


## Requirement 3: Print the booked Flight tickets
- This page should contain PNR ID & Booking ID field.
- If the customer or officials enter either of the field then the system would generate all the booking details along with customer details


## Requirement 4: Booking Details
- Flight Dropdown and the Schedule drop down should be displayed .
- When the official login and click the Booking details link, then the entire booking details for this specific flight should be displayed for schedule time.refer to below format to display result

 
