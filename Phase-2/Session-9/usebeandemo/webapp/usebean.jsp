<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- id is the object of class -->
<jsp:useBean id="obj" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>

<h3>Values Before Set</h3>
<!-- let's call getter methods -->
Roll No: <jsp:getProperty property="rollNo" name="obj"/><br>
Name:    <jsp:getProperty property="name" name="obj"/><br>

<!-- property- variable name of class, name means usebean object -->
<jsp:setProperty property="rollNo" name="obj" value="20"/> <!-- calling obj.setRollNo(10) -->
<jsp:setProperty property="name" name="obj" value="Alex"/> <!-- calling obj.setName("Alex") -->

<!-- let's call getter methods -->
<h3>Values After Set</h3>
Roll No: <jsp:getProperty property="rollNo" name="obj"/><br>
Name:    <jsp:getProperty property="name" name="obj"/><br>

<a href="next.jsp">Next Page</a>
</body>
</html>