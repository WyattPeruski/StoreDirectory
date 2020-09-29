<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "/Login" method = "post">
<input id = "username" name = "username"> <br>
<input type = "password" id = "password" name = "password">
<button type = "submit">Login</button>
</form>
<span>Don't have a prime account? Sign up <a href = "/signup">here!</a></span>

<p class = "message" >${message }</p>
</body>
</html>