<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Scriptlet -->
<%
	int a=10;
	int b=20;
	int c=a+b;
	out.print("Result is "+c);
%>
<!-- Declaration -->
<%! String name="sonam soni"; %>
<!-- Expression -->
<h1><%= "May name is  "+name %></h1>
<%! int cube(int n){
	return n*n*n;
}
%>
<%= "Cube of 5 is "+cube(5) %>
<br>
<%= new java.util.Date() %>

</body>
</html>