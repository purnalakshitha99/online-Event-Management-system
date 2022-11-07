<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String date = request.getParameter("date");
	String venue = request.getParameter("venue");
	String numberOfGuest = request.getParameter("guests");
	String Handler = request.getParameter("handler");
	
	%>

	<form action="delete" method = "post"> 
	Event ID: <input type = "text" name = "eventid" value = "<%= id%> "readonly><br>
	Event Name : <input type = "text" name = "eventname" value = "<%=name%>"readonly><br>
	Date : <input type = "date" name = "eventdate" value = "<%=date%>"readonly><br>
	Venue : <input type = "text" name = "eventvenue" value = "<%=venue%>"readonly><br>
	Number of Guest : <input type = "text" name = "numberofguest" value = "<%=numberOfGuest%>"readonly><br>
	Evnet Handler : <input type = "text" name = "eventhandler" value = "<%=Handler%>"readonly><br>
	
	
	<input type = "submit" name = "submit" value = "Delete Event">
	</form>

</body>
</html>