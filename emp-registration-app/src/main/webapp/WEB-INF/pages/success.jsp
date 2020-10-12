<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
	<h1>Emp Registration Success</h1>
	<hr>
	<h2>Emp Registration successful with the following data:</h2>
	<table>
		<tr>
			<td>Emp Id</td>
			<td>${emp.empId}</td>
		</tr>
		<tr>
			<td>Name:</td>
			<td>${emp.name}</td>
		</tr>
		<tr>
			<td>City</td>
			<td>${emp.city}</td>
		</tr>
		<tr>
			<td>Salary</td>
			<td>${emp.salary}</td>
		</tr>
	</table>
	<a herf="">Go To Register Page</a>
</body>
</html>