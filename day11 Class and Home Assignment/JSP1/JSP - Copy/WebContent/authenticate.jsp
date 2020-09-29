<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authenticate</title>
</head>
<body>

	<%
	String username = request.getParameter("name");
	String password = request.getParameter("password");
	if (username.equals(password)) {

		ArrayList<String> users = new ArrayList<>();
		users.add("Dev");
		users.add("Ram");
		users.add("Ayush");
		users.add("Lucky");
		users.add("Roy");
		session.setAttribute("data", users);
		//session.setAttribute("display","false");
	%>


	<jsp:forward page="success.jsp" />

	<%
		} else {
	%>
	<jsp:forward page="failure.jsp" />
	<%
		}
	%>

</body>
</html>