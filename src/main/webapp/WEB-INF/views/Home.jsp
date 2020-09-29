<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wyatt's List</title>
</head>
<body style ="font-family:Arial;background-color:linear-gradient(to right, black 0%, #00274C 80%)";>
<%@include file = "partials/optional.jsp" %>

<c:if test="${not empty name }">

<span>Here is your <a href = "/primeDirectory">prime search</a></span>
<p class = "message">${message }</p>
</c:if>


</body>
</html>