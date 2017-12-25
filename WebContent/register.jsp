<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<style>
body{
			background-color: #ead9c8;
		}
label {
	    display: inline-block;
		width: 260px;
		text-align: right;
	}

</style>
<body>
<center>
<h2>${message}</h2>
<h2>Register</h2>
<form:form id="regForm" modelAttribute="user" action="register" method="post">
<label>UserName  <input type="text" name="userName" required="required"></label><br><br>
<label>Password  <input type="password" name="password" required="required"></label><br><br>
<label>FirstName  <input type="text" name="firstName" required="required"></label><br><br>
<label>LastName  <input type="text" name="lastName" required="required"></label><br><br>
<label>Department  <input type="text" name="dept" required="required"></label><br><br>
<label>Address  <input type="text" name="address" required="required"></label><br><br>
<label>Email  <input type="email" name="email" required="required"></label><br><br>
<input type="submit" value="Register"/><br><br><br>
<label> Click here to <a href="doctorLogin.jsp">login now!</a></label>
</form:form>
</center>
</body>
</html>