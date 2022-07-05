<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num" value="1234.5678"></c:set>
Number: <fmt:formatNumber maxFractionDigits="2" value="${num }" ></fmt:formatNumber><br>
Number: <fmt:formatNumber groupingUsed="false" maxFractionDigits="2" value="${num }" var="newNum"></fmt:formatNumber><br>
Old: <c:out value="${num }"/> New:<c:out value="${newNum }"></c:out><br>
<h3>Format date</h3>
<c:set var="today" value="<%= new Date() %>"/>
Small Date: <fmt:formatDate value="${today }" dateStyle="short" timeStyle="short" type="both"/><br>
Medium Date: <fmt:formatDate value="${today }" dateStyle="medium" timeStyle="medium" type="both"/><br>
Long Date: <fmt:formatDate value="${today }" dateStyle="long" timeStyle="long" type="both"/><br>
Formatted date: <fmt:formatDate value="${today }" pattern="yyyy-MM-dd"/>
</body>
</html>