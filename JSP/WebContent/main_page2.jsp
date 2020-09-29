<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2"><jsp:include page="header.jsp"/></td>
		</tr>
		<tr>
			<td><jsp:include page="nav_bar.jsp" /></td>
			<td><jsp:include page="content.jsp"/></td>
		</tr>
		<tr>
			<td colspan="2"><jsp:include page="footer.jsp" /></td>
		</tr>
	</table>

</body>
</html>