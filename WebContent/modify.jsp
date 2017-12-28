<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Modify</title>

	</head>
	<style>
		body{
				background-color: #ead9c8;
			}

	</style>
	<body>
		<h2>Modify Appointment</h2>
		<form:form method="POST" action="saveModify">
	   		<table align="left" border="1">
			    <tr>
			        <td><form:label path="aid">Appointment id:</form:label></td>
			        <td><form:input path="aid" value="${a.aid}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="firstName">Patient FirstName:</form:label></td>
			        <td><form:input path="firstName" value="${a.firstName}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="lastName">Patient LastName:</form:label></td>
			        <td><form:input path="lastName" value="${a.lastName}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="day">Day:</form:label></td>
			        <td><form:input path="day" value="${a.day}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="time">Time:</form:label></td>
                    <td><form:input path="time" value="${a.time}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="pending">Pending:</form:label></td>
			        <td><form:input path="pending" value="${a.pending}" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="contactType">ContactType:</form:label></td>
			        <td><form:input path="contactType" value="${a.contactType}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="email">Email:</form:label></td>
			        <td><form:input path="email" value="${a.email}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="address">Address</form:label></td>
			        <td><form:input path="address" value="${a.address}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="doctor">Doctor</form:label></td>
                    <td><form:input path="doctor" value="${a.doctor}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="dept">Department:</form:label></td>
			        <td><form:input path="dept" value="${a.dept}" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="mobile">Mobile:</form:label></td>
			        <td><form:input path="mobile" value="${a.mobile}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="reason">Reason:</form:label></td>
			        <td><form:input path="reason" value="${a.reason}"/></td>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		<br><br>
  <c:if test="${!empty appointments}">
		<h2>List Appointments</h2>
	<table align="left" border="1">
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
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${appointments}" var="a">
			<tr>
				<td><c:out value="${a.aid}"/></td>
				<td><c:out value="${a.firstName}"/></td>
				<td><c:out value="${a.lastName}"/></td>
				<td><c:out value="${a.email}"/></td>
				<td><c:out value="${a.address}"/></td>
				<td><c:out value="${a.pending}"/></td>
				<td><c:out value="${a.reason}"/></td>
				<td><c:out value="${a.doctor}"/></td>
				<td><c:out value="${a.dept}"/></td>
				<td><c:out value="${a.mobile}"/></td>
				<td><c:out value="${a.time}"/></td>
				<td><c:out value="${a.day}"/></td>
				<td><c:out value="${a.contactType}"/></td>
				<td align="center"><a href="edit.html?id=${a.aid}">Edit</a> | <a href="delete.html?id=${a.aid}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	<a href="welcome.jsp">Home</a>	 
	</body>
</html>