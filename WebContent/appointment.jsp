<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment</title>
<script>
function populate(s1,s2){
	var s1 = document.getElementById(s1);
	var s2 = document.getElementById(s2);
	s2.innerHTML = "";
	if(s1.value == "ENT"){
		var optionArray = ["|","Dr.jay|Dr.Jay","Dr.raj|Dr.Raj"];
	} else if(s1.value == "General"){
		var optionArray = ["|","Dr.khetan|Dr.Khetan","Dr.robert|Dr.Robert"];
	} else if(s1.value == "Cardiology"){
		var optionArray = ["|","Dr.joe|Dr.Joe","Dr.sheela|Dr.Sheela"];
	}
	for(var option in optionArray){
		var pair = optionArray[option].split("|");
		var newOption = document.createElement("option");
		newOption.value = pair[0];
		newOption.innerHTML = pair[1];
		s2.options.add(newOption);
	}
}
</script>
</head>
	<style>
		body{
			background-color: #ead9c8;
		}
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
<label>Choose Department</label>
<select id="slct1" name="dept" onchange="populate(this.id,'slct2')" required="required">
  <option value=""></option>
  <option value="ENT">ENT</option>
  <option value="General">General</option>
  <option value="Cardiology">Cardiology</option>
</select><br><br>
<label>Choose Doctor</label>
<select id="slct2" name="doctor" required="required"></select><br><br>
<label>Choose Day </label><input type="date" name="day"/><br><br>	   	
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
	<a href="home.jsp">Home</a></li>

</form:form>
</body>
</html>