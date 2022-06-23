<!-- Page Directive -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String responseCheck=request.getParameter("office");
	if(responseCheck!=null){
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "response-redirect.jsp?office="+responseCheck);
	}
%>
<%
	String error=request.getParameter("error");
	if(error!=null){
		throw new RuntimeException("Exception Occured");
	}
%>

<a href="implicit.jsp?office=head_office">Check the use of response and request object</a>
<br><br>
<a href="implicit.jsp?error=1">Check the use of Exception object</a>

<%
	String serverName=request.getServerName();
	out.print("Server Name "+serverName+"<br>");
	out.print("Servlet Name: "+config.getServletName()+"<br>");
	out.print("Server Info "+application.getServerInfo()+"<br>");
	out.print("Page Details "+page.toString()+"<br>");
	pageContext.setAttribute("userid", "test@gmail.com");
	out.print("Page Context Attribute "+pageContext.getAttribute("userid"));
	
	
%>

</body>
</html>