<!-- this is the registration form for the customer -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
<h1>Customer Registration</h1>
<hr>
<h4>Please register.</h4>
<form action="servlet" method="post">
<table>
<tr>
<td>Email Id:</td>
<td><input type="text" name="mail"></td>
</tr>
<tr>
<td>First Name:</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>Last Name:</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>
<td>Phone Number::</td>
<td><input type="text" name="phone"></td>
</tr>

</table>
<input type="hidden" name="action" value="register">
<input style="align-items: center;" type="submit" name="submit" value="Submit Request">

</form>
</body>
</html>