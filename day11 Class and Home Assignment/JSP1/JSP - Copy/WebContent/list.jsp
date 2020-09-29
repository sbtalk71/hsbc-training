<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:blue">Users are:</h1>
	<table>
		<%
			ArrayList<String> users = (ArrayList<String>) session.getAttribute("data");
		for (String user : users) {
		%>
		<tr>
			<td><%=user%></td>
		</tr>
		<%
			}
		%>


	</table>
</body>
</html>