<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="income" value="${4000*50 }" scope="session"></c:set>
Income: <c:out value="${income }"></c:out> <br>
<c:remove var="income"/>
After Remove Income: <c:out value="${income }"></c:out> <br>
<c:catch var="ex">
	<% int c= 10/0;%>
</c:catch>
Exception is <c:out value="${ex }"></c:out><br>
<c:set var="test" value="700"></c:set>
<c:if test="${test>500 }">
	<c:out value="The value is more than 500"/>
</c:if>
<br>
<c:choose>
	<c:when test="${test>1000 }">
		<c:out value="The value is more than 1000"/>
	</c:when>
	<c:otherwise>
		<c:out value="The value is less than 1000"/>
	</c:otherwise>
</c:choose>
<br><h3>For tokens</h3>
<c:forTokens items="1,2,3,4,5,6,7,8,9,10" delims="," var="x">
	<c:out value="${x }"/><br>
</c:forTokens>


</body>
</html>