<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Product List</h3>
<c:if test="${!empty productlist }">
	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Date</th>
		</tr>
		<c:forEach items="${productlist }" var="product">
			<tr>
				<td>${product.name }</td>
				<td>${product.price }</td>
				<td>${product.dateAdded }</td>
			</tr>
		</c:forEach>
	</table>

</c:if>
</body>
</html>	