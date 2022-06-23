<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Next Page</h1>
<jsp:useBean id="obj" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>
<h3>User Details</h3>
Roll No: <jsp:getProperty property="rollNo" name="obj"/><br>
Name:    <jsp:getProperty property="name" name="obj"/><br>

</body>
</html>