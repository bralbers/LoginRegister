<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form method="GET" action="SetUser">
		<input type="text" name="username" placeholder="Username"/><br>
		<input type="password" name="password" placeholder="Password"/><br>
		<input type="password" name="confirmPassword" placeholder="Confirm Password"/><br>
		<input type="text" name="firstName" placeholder="First Name"/><br>
		<input type="text" name="lastName" placeholder="Last Name"/><br>
		<input type="email" name="email" placeholder="example@domain.com"/><br>
		<input type="submit" formmethod="post">
	</form>
</body>
</html>