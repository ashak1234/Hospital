<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appt page</title>
</head>
<style>
	body{
			background-color: #ead9c8;
		}
	ul{
		list-style-type: none;
	}
</style>
<body>

<center>
	<h2>Appointment List</h2>
	
	<c:if test="${not empty apptList}">
		<ul>
			<c:forEach var="patient" items="${apptList}">
				<li>${patient.firstName}</li>
			</c:forEach>
		</ul>
	</c:if>
	<a href="appointment.jsp">Back</a>
		
</center>
</body>
</html>