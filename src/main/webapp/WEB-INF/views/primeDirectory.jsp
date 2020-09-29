<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach var = "list" items = "${list }">
<tr>
<td>${list.name }
</td>
<td>${list.catagory }
</td>

<td>$${list.price }
</td>
</tr>

</c:forEach>

</table>
</body>
</html>