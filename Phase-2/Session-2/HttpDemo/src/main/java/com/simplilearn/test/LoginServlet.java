package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		//get Request parameter entered by user
		String email= req.getParameter("email");
		String pass= req.getParameter("pass");
		PrintWriter out= resp.getWriter();
		if(pass.equals("admin123"))
			out.print("<h1>Welcome "+email+"</h1>");
		else
			out.print("<h2>Wrong username or password");
	}
}
