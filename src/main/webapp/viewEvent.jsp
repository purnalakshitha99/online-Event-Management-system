<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Event Table</h1>

	<table border="1">
		<tr>
			<th>EventID</th>
			<th>Event Name</th>
			<th>Event Date</th>
			<th>Venue</th>
			<th>Number of Guest</th>
			<th>Handler</th>
		</tr>

		<c:forEach var="sa" items="${events }">

			<c:set var="id" value="${sa.eventId}" />
			<c:set var="name" value="${sa.eventName}" />
			<c:set var="date" value="${sa.date}" />
			<c:set var="Venue" value="${sa.venue}" />
			<c:set var="numberOfGuest" value="${sa.numberOfGuest}" />
			<c:set var="handleby" value="${sa.handler}" />





			<tr>
				<td>${sa.eventId }</td>
				<td>${sa.eventName }</td>
				<td>${sa.date}</td>
				<td>${sa.venue }</td>
				<td>${sa.numberOfGuest}</td>
				<td>${sa.handler}</td>

				<c:url value="updateEvent.jsp" var="upEvent">
					<c:param name="id" value="${id }" />
					<c:param name="name" value="${name }" />
					<c:param name="date" value="${date }" />
					<c:param name="venue" value="${Venue }" />
					<c:param name="guests" value="${numberOfGuest }" />
					<c:param name="handler" value="${handleby }" />
				</c:url>
				
				
				<td><a href="${upEvent}"> <input type="button" name="update"
					value="Update Event Details">
				</a></td>
				<c:url value="deleteEvent.jsp" var="delEvent">
					<c:param name="id" value="${id }" />
					<c:param name="name" value="${name }" />
					<c:param name="date" value="${date }" />
					<c:param name="venue" value="${Venue }" />
					<c:param name="guests" value="${numberOfGuest }" />
					<c:param name="handler" value="${handleby }" />
				</c:url>
				<td><a href="${delEvent}"> <input type="button" name="Delete"
					value="Delete Event ">
				</a></td>


			</tr>

		</c:forEach>
	</table>


</body>
</html>