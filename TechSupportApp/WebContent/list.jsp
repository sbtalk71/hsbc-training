<%@page import="java.util.List"%>
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
		List<String> reqList = (List<String>) session.getAttribute("list");
		for (String s : reqList) {
			out.print(s);
		}
	%>
	
	<%--You can use JSTL instead of the above code --%>
</body>
</html>