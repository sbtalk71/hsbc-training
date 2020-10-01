<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:olive">CUSTOMER REGISTRATION</h1>
<hr>

<h3>Please Register</h3>
<form method="post" action="checkUser">
<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		
		<tr>
			<td>Phone number</td>
			<td><input type="text" name="pno"></td>
		</tr>
	
	
		<tr>
			
			<td>
			<input type="hidden" name="action" value="register">
			<input type="submit" value="Submit request"></td>
			
		</tr>
	
	</table>
</form>
</body>
</html>