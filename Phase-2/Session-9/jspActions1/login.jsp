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
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
		
	if(pass.equals("admin123")){
%>
<jsp:forward page="success.jsp">
	<jsp:param value="<%=name %>" name="uname"/>
</jsp:forward>
<% }else{%>
<h3>Wrong User name and password</h3>
<jsp:include page="index.html"></jsp:include>
<%} %>
</body>
</html>