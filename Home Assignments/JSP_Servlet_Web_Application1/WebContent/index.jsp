<!-- this is the index page for the customer -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XYZ Corporation, IT Department</title>
</head>
<body>
<h1>Technical Support Request</h1>
<hr>
<form method="post" action="servlet">
<table align="center" width="100%" cellspacing="2" cellpadding="2">
<tr>
<td align="right">Email: </td>
<td><input type="text" name="email" align="left" size="25"></td>
</tr>

<tr>
<td align="right">Software: </td>
<td><select name="software" size="1">
<option value="Word">Microsoft Word</option>
<option value="Excel">Microsoft Excel</option>
<option value="Access">Microsoft Access</option>
</select>
</td>
<td align="right">Operating System: </td>
<td><select name="os" size="1">
<option value="2000">Windows 2000</option>
<option value="xp">Windows xp</option>
<option value="linux">Linux</option>
</select>
</td>
</tr>
</table>
<br>
Problem Description
<br>
<textarea name="problem" cols="50" rows="4"></textarea>
<hr>
<input type="hidden" value="Add Request" name="action">
<input type="submit" value="submit" name="submit">

</form>
</body>
</html>