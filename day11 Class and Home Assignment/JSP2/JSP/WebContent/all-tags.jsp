<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Tags</title>
</head>
<body>
	<%--Declaration tag --%>
	<%!String fname = "Dev";
	String lname = "Ojha";

	public String concat(String s1, String s2) {
		return s1 + s2;
	}%>

	<%-- Expression tags --%>
	<%=("Expression tags: " + fname + " " + lname)%>
	<%=concat(fname, lname)%>
	<%--Scriplets --%>

	<%
		out.print("Scriplets: " + fname + " " + lname);
	%>
</body>
</html>