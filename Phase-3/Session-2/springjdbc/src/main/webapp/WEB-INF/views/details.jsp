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
<h3>Products Details Page</h3>
<c:set var="product" value="${obj }"></c:set>
Name: ${product.id } <br>
Price: ${product.price } <br>
Date: ${product.dateAdded } <br>
</body>
</html>