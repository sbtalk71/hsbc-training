<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>TECHNICAL SUPPORT REQUEST</h1>
<hr>

<form action="checkUser" method="POST">
<table>
<tr>
<td>Email</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Software</td>
<td><input type="text" name="software"></td>
</tr>
<tr>
<td>Operating System</td>
<td><input type="text" name="os"></td>
</tr>
<tr>
<td>Problem Description</td>
<td><input type="textarea" name="description"></td>
</tr>

<tr>
<td>
<input type="hidden" name="action" value="reqSub">
<input type="submit" value="Submit Request"></td>
</tr>
</table>
</form>
</body>
</html>