<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" info="This is my error handling page" 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Error Handling Page</h1>
<%= exception.getMessage() %>

<%@ include file="date.jsp" %>
</body>
</html>