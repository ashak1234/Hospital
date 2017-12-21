<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

<style>

	body{ 
	    font-family:Verdana, Arial; 
	    font-size:15px;
	}
	section{
		background-color: white;
	}
	
	ul{	
		list-style-type: none;
		margin: 0;
	    padding: 0;
	}
	
	li {
	    float: left;
	}
	
	li a {
	    display: block;
	    padding: 14px;
	    width: 190px;
	    background-color: yellow
	}
	
	li a:hover{
	    background-color: rgb(0, 188, 242);
	}
	
	li:hover{
	    background-color: rgb(0, 188, 242);   
	}
	
	.active {
	    background-color: #4CAF50;
	}
	</style>
</head>
<body>
	<center>
		<h2> Welcome ${firstname}</h2>
		<br>
		<br>
		<section>
		<ul>
		  <li><a href="#home">Home</a></li>
		  <li><a href="#queue">Patient Queue</a></li>
		  <li><a href="#search">Patient Search</a></li>
		  <li><a href="#reports">Reports</a></li>
		  <li><a href="#tools">Tools</a></li>
		  <li><a href="welcome.jsp" > SignOut</a></li>
		</ul>
		</section>
	</center>
</body>
</html>