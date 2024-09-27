<!-- this is the response page for the customer -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Service Response</title>
</head>
<body>
<h1>Customer Service Response</h1>
<p>Thank you for your request, which has been recorded and will be responded to within three business days.</p>
<hr>
<p>Customer name: <%=session.getAttribute("fname") %> </p> 
<hr>
<p>XYZ Corporation, Customer Service at 1.800 xyz corp.</p>
</body>
</html>