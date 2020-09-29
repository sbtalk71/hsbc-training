<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the Login Page</h1>
	<form name='login' action='authenticate.jsp' method='get'>
		<table>
			<tr>
				<td>Name: <input type='text' name='userName'>
				</td>
				<td>Password: <input type='text' name='password'></td>
				<td><input type='submit' name='submit' value='submit'></td>

			</tr>
		</table>

	</form>
</body>
</html>