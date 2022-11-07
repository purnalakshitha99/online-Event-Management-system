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
	
	
	<form action="update" method = "post"> 
	Event ID: <input type = "text" name = "eventid" value = "<%= id%> "readonly><br>
	Event Name : <input type = "text" name = "eventname" value = "<%=name%>"><br>
	Date : <input type = "date" name = "eventdate" value = "<%=date%>"><br>
	Venue : <input type = "text" name = "eventvenue" value = "<%=venue%>"><br>
	Number of Guest : <input type = "text" name = "numberofguest" value = "<%=numberOfGuest%>"><br>
	Evnet Handler : <input type = "text" name = "eventhandler" value = "<%=Handler%>"><br>
	
	
	<input type = "submit" name = "submit" value = "Update Event">
	</form>


</body>
</html>