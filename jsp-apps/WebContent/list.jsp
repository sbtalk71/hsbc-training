<%@page import="com.hsbc.tr.web.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="user" class="com.hsbc.tr.web.User" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>
	<table>
		<%
			User u = (User) session.getAttribute("user");
			for (String s : u.getUsers()) {
		%>
		<tr>
			<td><%=s%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>