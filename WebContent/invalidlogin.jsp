<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		width: 300px;
		text-align: right;
	}

</style>
<body>
<center>
<h2>${message}</h2>
<h2>Login</h2>
<form:form id="loginForm" modelAttribute="user" action="doctorLogin" mehtod="post">
<label>UserName  <input type="text" name="name"/></label><br>
<label>Password  <input type="password" name="password"/></label><br><br>
<input type="submit" value="Submit"/><br><br><br>
<label> New Doctor? <a href="register.jsp">Register Here</a></label>
</form:form>
</center>
</body>
</html>