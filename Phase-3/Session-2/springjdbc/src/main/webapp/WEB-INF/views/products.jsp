<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Products Page</h3>
<table>
	<tr><th>Id</th><th>Name</th><th>Price</th><th>Date</th></tr>
	<c:forEach var="p" items="${list }">
		<tr>
			<td><a href="details?id=${p.id }">${p.id }</a></td>
			<td>${p.name }</td>
			<td>${p.price }</td>
			<td>${p.dateAdded }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>