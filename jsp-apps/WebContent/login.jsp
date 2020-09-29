<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login Form</title>
</head>
<body>
	<h1 style="color: blue">Login Here</h1>
	<hr>
	<form action="authenticator.jsp" method="get">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>