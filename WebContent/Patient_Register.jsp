<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html; charset = ISO-8859-1">
<title>Patient_Register</title>
</head>
<body>

	<h1 align="center">Patient Register Page</h1>

	<form:form name = "form1" modelAttribute="patient" method = "post" action = "patient_Register" >
		
	<table align="center">
		
	<tr>	<td>First Name<td>	<td><input type = "text"	 name = "firstName" required="required"></td>	</tr>
	<tr>	<td>Last Name<td>	<td><input type = "text"	 name = "lastName" 	required="required"></td>	</tr>
	<tr>	<td>Email<td>		<td><input type = "email"	 name = "email" 	required="required"></td>	</tr>
	<tr>	<td>User Name<td>	<td><input type = "text"	 name = "userName" 	required="required"></td>	</tr>
	<tr>	<td>Password<td>	<td><input type = "password" name = "password" 	required="required"></td>	</tr>
		
	<tr>
		<td></td>
		<td></td>
		<td><input type = "submit" name = "Submit" value = "Sign Up"></td>
	</tr>
		
	</table>
		
	</form:form>














</body>
</html>