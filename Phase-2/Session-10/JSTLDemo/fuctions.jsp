<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Functions Tags</title>
</head>
<body>
<c:set var="name" value="Simplilearn"></c:set>
<c:set var="name1" value="learn"></c:set>
LowerCase: ${fn:toLowerCase(name) }<br>
UpperCase: ${fn:toUpperCase(name) }<br>
<c:if test="${fn:contains(name,name1) }">
	String contains the defined value<br>
</c:if>
<c:set var="str" value="Hello World Message"></c:set>
<c:set var="str1" value="${fn:split(str,' ') }"></c:set>
${fn:join(str1,' - ') }<br>
Substring: ${fn:substring(name,0,6) }<br>
<h3>Iteration</h3>
<c:forEach items="${str1 }" var="x">
	<c:out value="${fn:toUpperCase(x) }"></c:out><br>
</c:forEach>
</body>
</html>