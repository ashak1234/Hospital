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
        background-color: #ead9c8;
	}
	
	h2 {
    text-align: right;
	}	
	
	#header{	
		margin-left: 200px; 
        height:10px;
        width:400px;
        text-align:right;
	}
	
  li{
		margin-left:15px;	
		border-radius: 5px;   
	    border: 2px solid  #ac7339;
		background-color:  #ac7339; ;
		height: 50px;
		width: 200px;
		margin: 10px;
		text-align: center;
 	}
 
 ul{	
		list-style-type: none;
		margin: 0;
	    padding: 0;
	}
  a {
		text-decoration: none;
	    text-align:center;
	    padding-top: 2cm;
		color: black;
		font-family: Verdana, sans-serif;
	}
	
</style>
</head>
<body>
<div id = "header"> 	
		<h2> Welcome ${firstname} </h2>	
	
</div>
	<section>
		<ul>
		  <li><a href="#home">Home</a></li>
		  <li><a href="#pending">Pending Requests</a></li>
		  <li><a href="#search">Patient Search</a></li>
		  <li><a href="#reports">Reports</a></li>
		  <li><a href="#tools">Tools</a></li>
		  <li><a href="home.jsp" > SignOut</a></li>
		</ul>
	</section>
</body>
</html>