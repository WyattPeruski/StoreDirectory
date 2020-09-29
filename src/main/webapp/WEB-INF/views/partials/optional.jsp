<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "background-color:linear-gradient(to right, black 0%, #00274C 80%);">
<c:choose>
<c:when test = "${ not empty name }">
<h1>Welcome <c:out value = "${name.name }"/></h1><c:if test="${name.admin == 1 }">
<c:out value = "(admin)"/>
 - here are your admin<a href = "/adminPrivledges"> privedges</a>
</c:if><br>
<p class = "message"></p>
<a href="/logout">Logout</a>

</c:when>
<c:otherwise>
<p class = "message">${message }</p>
Welcome to Wyatt's List. Choose to <a href = "/directory">browse</a> our inventory, or log in with your <a href = "/Login">prime account</a>
</c:otherwise>
</c:choose>
</body>
</html>