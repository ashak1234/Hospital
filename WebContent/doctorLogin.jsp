<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Doctor</title>
</head>
<style>
body{
			background-color: #ead9c8;
		}
label {
	    display: inline-block;
		width: 400px;
		text-align: right;
	}
.login{
	border: 5px black;
	width: 100px;
	background-color:#ac7339; 
	height: 300px;	
	padding-right:10cm;
}

</style>
<body>
<center>
<div class="login">
<center>
<h2>Login</h2>
<form:form id="loginForm" modelAttribute="user" action="doctorLogin" mehtod="post">
<label>UserName  <input type="text" name="userName" required="required"></label><br>
<label>Password  <input type="password" name="password" required="required"></label><br><br>
<label><input type="submit" value="Submit"/></label><br><br><br>
<label> New Doctor? <a href="register.jsp">Register Here</a></label>
</form:form>
</center>
</div>
</center>
</body>
</html>