<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogOut</title>
</head>
<body>
	<h3>Are you sure you want to logout?</h3>
	<form method="GET" action="InvalidateSession">
		<input type="submit" formmethod="post">
	</form>
	<p>Click <a href="http://localhost:8088/LoginRegister">here</a> to go back</p>
</body>
</html>