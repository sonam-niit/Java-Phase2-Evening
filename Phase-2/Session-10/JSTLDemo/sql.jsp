<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn" 
driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/ecommerce" 
user="root" password="Sonam@123"/>

<sql:query var="result" dataSource="${conn }">
	select * from eproduct
</sql:query>
<table border=1 cellspacing=0 cellpadding=10>
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Price</th>
	<th>Date</th>
</tr>
<c:forEach items="${result.rows}" var="p">
<tr>
<td><c:out value="${p.id }"/></td>
<td><c:out value="${p.name}"/></td>
<td><c:out value="${p.price}"/></td>
<td><c:out value="${p.date_added}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>