<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment</title>
</head>
	<style>
		label {
			  display: inline-block;
			  width: 200px;
			  text-align: right;
			}
		legend {			  
			  width: 200px;
			  text-align: right;
			  font-size:15px;
			  text-align: right;
			}	
		#sub{			 
			 text-align: right;
		}
	</style>
<body>
<h2> <center> Make an Appointment </center></h2>
<form:form id="appointmentForm" modelAttribute="appoint" action="appointment" method="POST">
<legend><b>Fill up Appointment Details</b></legend><br>
<label>FirstName </label><input type="text" name="firstName" required="required"><br><br>
<label>LastName </label><input type="text" name="lastName" required="required"><br><br>
<label for="dept">Choose Department </label><input id="dept_name" name="dept" type="text" list="deptlist" required="required">		
		<datalist id="deptlist">
		   <option value="ENT"></option>
		   <option value="Genral"></option>
		   <option value="Cardiology"></option>
		   <option value="Neurology"></option>
		   <option value="Orthopedics"></option>
		   <option value="Pediatrics"></option>
		</datalist><br><br>
<label for="doctor_name">Choose Doctor </label><input id="doctor_name" name="doctor" type="text" list="doctorlist" required="required">		
		<datalist id="doctorlist">
		   <option value="Dr.Jay"></option>
		   <option value="Dr.Kethan"></option>
		   <option value="Dr.Robert"></option>
		   <option value="Dr.Chris"></option>
		   <option value="Dr.Raj"></option>
		</datalist><br><br>
<label>Choose Day </label><input type="date" name="date"/><br><br>	   	
<label for="time">Select time </label><input id="time" name="time" type="text" list="timings" required="required">		
		<datalist id="timings">
		   <option value="10:00"></option>
		   <option value="10:30"></option>
		   <option value="11:00"></option>
		   <option value="11:30"></option>
		   <option value="12:00"></option>
		</datalist><br><br>
<label>Reason </label><input type="text" name="reason"><br><br>
<legend><b>Your Contact Information</b></legend><br>
		<label>Email:</label><input type="email" name="email" required="required"><br><br>
		<label>Mobile:</label><input type="text" name="mobile" required="required"><br><br>
		<label>Address:</label><textarea name="address" style = "vertical-align: top" rows="2" cols="50" required="required"></textarea>
		<br>
		<label> Method to contact you:</label>
							  <input type="radio" name ="contactType" value="email">email
							  <input type="radio" name="contactType" value="mobile">Whatsapp
							  <input type="radio" name="contactType" value="address">In-app chat<br><br>
	
	<legend> <input id="sub" type=submit value="Submit!"></legend>

</form:form>
</body>
</html>