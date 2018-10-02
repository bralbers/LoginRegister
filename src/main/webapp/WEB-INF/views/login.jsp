<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
</head>
<body>
	<form method="GET" action="GetUser">
		<input type="text" name="username" placeholder="Username" /><br>
		<input type="text" name="password" placeholder="Password" /><br>
		<input type="submit" formmethod="post">
	</form>
	<p>
		Click <a href="register">here</a> to register or <a
			href="http://localhost:8088/LoginRegister">here</a> to go
		back
	</p>
</body>
</html>