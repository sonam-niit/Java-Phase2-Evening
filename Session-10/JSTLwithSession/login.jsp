<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="name" value="${param.name }"/>
<c:set var="pass" value="${param.pass }"/>
<c:set var="pass1" value="admin123"/>
<c:choose>
	<c:when test="${fn:contains(pass,pass1)}">
		<c:set var="uname" value="${name }" scope="session"></c:set>
		<jsp:forward page="success.jsp"></jsp:forward>
	</c:when>
	<c:otherwise>
		<h3>Wrong User name and password</h3>
		<jsp:include page="index.html"></jsp:include>
	</c:otherwise>
</c:choose>

</body>
</html>