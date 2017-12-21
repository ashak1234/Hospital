<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient</title>
</head>
<style>
label {
	    display: inline-block;
		width: 220px;
		text-align: right;
	}

</style>
<body>
<center>
<h2>Login</h2>
<form action="patientLogin">
<label>UserName  <input type="text" name="userName"/></label><br>
<label>Password  <input type="password" name="password"/></label><br><br>
<input type="submit" value="Submit"/><br><br><br>
<label> New Patient? <a href="register.jsp">Register Here</a></label>
</form>
</center>
</body>
</html>