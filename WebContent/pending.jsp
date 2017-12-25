<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appt page</title>
</head>
<body>
body{
			background-color: #ead9c8;
		}
<center>
	<h2>Pending List</h2>
	
	<c:if test="${not empty list}">

		<ul>
			<c:forEach var="listValue" items="${list}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>
</center>
</body>
</html>