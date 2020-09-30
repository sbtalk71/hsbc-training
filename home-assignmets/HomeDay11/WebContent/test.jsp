<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--JSP include directive;
created only test.jsp file after compilation --%>

<%-- <%@include file="display.jsp" %>--%>

<%--JSP include action tag; two separate files are created on server --%>
<jsp:include page="display.jsp"/>
</body>
</html>