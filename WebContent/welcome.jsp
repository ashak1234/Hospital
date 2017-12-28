<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<style>
	body{ 		 
	    font-family:Verdana, Arial; 
	    font-size:15px;
        background-color: #ead9c8;
	}
	
	h3 {
    text-align: centre;
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
	    border: 2px solid #ac7339;
		background-color:#ac7339;		
		height: 50px;
		width: 200px;
		margin: 20px;
		text-align: center;
		list-style-type: none;		   
 	}  
 	
 	a {
		text-decoration: none;
	    text-align:center;	    
		color: black;
		font-family: Verdana, sans-serif;
	}
	
</style>

<body>
<div id = "header"> 	
		<h3> Welcome ${firstname} </h3>		
</div>
<ul>		  
		  <li><p><a href="pending">Pending Requests</a></p></li>		  
		  <li><p><a href="search">Patient Search</a></p></li>		  
		  <li><p><a href="reports">Reports</a></p></li>
		  <li><p><a href="show">View Appointments</a></p></li>
		  <li><p><a href="modify">Modify Appointments</a></p></li>
		  <li><p><a href="home.jsp">SignOut</a></p></li>		 
</ul>		
		

		
	
</body>
</html>