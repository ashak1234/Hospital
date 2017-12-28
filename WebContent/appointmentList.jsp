<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>List Appointments</title>
</head>
<style>
	body{
			background-color: #ead9c8;
		}

</style>
<body>
<h1>List Appointment</h1>

<c:if test="${!empty list}">
	<table align="center" border="1">
		<tr>
			<th>Appointment ID</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Address</th>
			<th>Pending</th>
			<th>Reason</th>
			<th>Doctor</th>
			<th>Department</th>			
			<th>Mobile</th>
			<th>Time</th>
			<th>Day</th>
			<th>ContactType</th>
		</tr>

		<c:forEach items="${list}" var="appointment">
			<tr>
				<td><c:out value="${appointment.aid}"/></td>
				<td><c:out value="${appointment.firstName}"/></td>
				<td><c:out value="${appointment.lastName}"/></td>
				<td><c:out value="${appointment.email}"/></td>
				<td><c:out value="${appointment.address}"/></td>
				<td><c:out value="${appointment.pending}"/></td>
				<td><c:out value="${appointment.reason}"/></td>
				<td><c:out value="${appointment.doctor}"/></td>
				<td><c:out value="${appointment.dept}"/></td>
				<td><c:out value="${appointment.mobile}"/></td>
				<td><c:out value="${appointment.time}"/></td>
				<td><c:out value="${appointment.day}"/></td>
				<td><c:out value="${appointment.contactType}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	<a href="welcome.jsp">Home</a>	 
</body>
</html>