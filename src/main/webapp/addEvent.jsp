<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<table>
<form action ="addEventServlet" method = "post">


<tr>
	<td>Event Name:</td>
	<td><input type = "text" name ="eventName" ></td>
</tr>
<tr>
	<td>Date:</td>
	<td><input type = "date" name ="date" > </td>
</tr>
<tr>
	<td>Venue:</td>
	<td><input type = "text" name ="venue" ></td>
</tr>
<tr>
	<td>NumberOfGuest:</td>
	<td><input type = "text" name ="numberOfGuest" ></td>
</tr>
<tr>
	<td>Handleby:</td>
	<td><input type = "text" name ="handler" ></td>
</tr>


</table>
<input type = "submit" name = "submit" value = "Add Event">





</form>

</body>
</html>