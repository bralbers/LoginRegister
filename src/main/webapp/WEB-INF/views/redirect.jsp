<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh"
	content="5; http://localhost:8088/LoginRegister">
<title>Redirect</title>
</head>
<body>
	<c:if test="${ requestScope.userStore == true }">
		<c:out value="User has been created" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.logIn == true }">
		<c:out value="You are now logged in" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.IncorrectUsername == true }">
		<c:out value="Username is too short" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.IncorrectPassword == true }">
		<c:out value="Password is too short" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.IncorrectConfirmPassword == true }">
		<c:out value="Password and Confirm Password are not the same" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.NullFirstName == true }">
		<c:out value="Must enter a first name" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.NullLastName == true }">
		<c:out value="Must enter a last name" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.NullEmail == true }">
		<c:out value="Must enter an email" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.disallowRegistration == true }">
		<c:out value="Username already exists" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.allowLogIn == false }">
		<c:out value="Username or Password does not match" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>

	<c:if test="${ requestScope.invalidateSession == true }">
		<c:out value="You are now logged out" />
		<br>
		<c:out value="Will redirect to homepage in 5 seconds" />
		<p>
			Click <a href="http://localhost:8088/LoginRegister">here</a>
			if failure to redirect
		</p>
	</c:if>
</body>
</html>