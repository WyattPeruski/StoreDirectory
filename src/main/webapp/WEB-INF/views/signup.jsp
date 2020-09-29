<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>Hello User, time to subscribe to Wyatt's Website Prime for $9.99 per month</p>

<form action="signup" method="post">
		<p>
			<label for="name">Your Name:</label> <input id="name" name="name"  required minlength="2" autocomplete="off"/>
		</p>
		<p>
			<label for="username">Username:</label> <input id="username" name="username" required minlength="2" />
		</p>
		<p>
			<label for="password">Password:</label> <input id="password" type="password" name="password" required minlength="2" />
		</p>
		<p>
			<label for="card">Card:</label> <input id="card" type="number" name="card" required minlength="2" />
		</p>
		<p>
			<button>Sign me Up!</button>
		</p>
	</form>
</body>
</html>