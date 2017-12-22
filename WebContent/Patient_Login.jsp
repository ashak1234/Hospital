<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html; charset = ISO-8859-1">
<title>Patient_Login</title>
</head>

<body>

<table align = "center">

	<tr><td align = "center" colspan = '2'><strong><font size = "5">Patient Login Page</font></strong></td></tr>

	<tr><td>&nbsp;</td></tr>
	
	<tr>
	<td>
	<form name = "form1" method = "post" action = "control">
	<table>
	
		<tr>
			<td width = 100px>User Name</td>
			<td><input type = "text" name = "userName" required="required"></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type = "password" name = "password" required="required"></td></tr>

		<tr><td>&nbsp;</td></tr>
		
		<tr>
			<td></td>
			
			<td>
				<input type = "submit" name = "Submit" value = "Login">
				&emsp;
				<input type = "reset" name = "Submit2" value = "Reset">
			</td>
		</tr>
	
	</table>
	</form>
	</td>
	
	<td>
	
	<form name = "form2" method = "post" action = "Patient_Register.jsp">
		<input type = "submit" name = "Submit" value = "Register">
	</form>

	</td>
	
	</tr>
	
</table>

</body>

</html>