<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<h1>Emp Registration Form</h1>
	<hr>
	<form action="reg" method="post" >
		Emp Id: <input name="id" type="text"><br /> 
		Name: <input name="name" type="text"><br /> 
		City: <input name="city" type="text"><br /> 
		Salary: <input name="salary" type="text"><br /> 
		<input value="Login" type="submit">
	</form>
</body>
</html>