<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request Accepted</title>
</head>
<body>
	<h1>Customer Service Request Received</h1>
	<p>Thank you for your request, which has been recorded and will be
		reponded within three working days.</p>
	<hr>
	Current User
	
	<%=request.getAttribute("name") %>

	<hr>
	<p>XYZ corporation,Customer Service at 1.800 xyz co.</p>
</body>
</html>