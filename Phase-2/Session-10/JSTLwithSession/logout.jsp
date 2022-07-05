<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.removeAttribute("uname");
	session.invalidate();
	
%>
successfully Logged Out..!!
<jsp:include page="index.html"></jsp:include>
</body>
</html>