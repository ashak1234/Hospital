<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Show</title>
</head>
<style>
	body{
			background-color: #ead9c8;
		}
</style>

<body><center>

<h2>View Appointments</h2>
	<c:if test="${not empty appointmentList}">

		<table width="50%" align="right" border="1">
			<tr>
				<th>FirstName</th>
				<th>Lastname</th>
				<th>Email</th>
				<th>Doctor</th>
				<th>Mobile</th>
			</tr>
			<c:forEach items="${appointmentList}" var="patient" varStatus="status">
				<tr>
					<td>${patient.firstName}</td>
					<td>${patient.lastName}</td>
					<td>${patient.email}</td>
					<td>${patient.doctor}</td>
					<td>${patient.mobile}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>	
		<br/>
</center>
</body>
</html>