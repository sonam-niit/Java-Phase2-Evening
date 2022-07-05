<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="books">
	<books>
		<book>
			<name>The Complete Refrence</name>
			<author>Mac Grow Hill</author>
		</book>
		<book>
			<name>Let Us C</name>
			<author>Balaguruswami</author>
		</book>
	</books>
</c:set>
<x:parse xml="${books }" var="data"></x:parse>
1st Book Name:<x:out select="$data/books/book[1]/name"/><br>
2nd Book Author:<x:out select="$data/books/book[2]/author"/><br>
</body>
</html>