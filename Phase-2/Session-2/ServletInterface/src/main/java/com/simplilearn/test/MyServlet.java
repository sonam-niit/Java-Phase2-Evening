package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/my")
public class MyServlet implements Servlet{

	private ServletConfig config;
	@Override
	public void destroy() {
		System.out.println("Servlet Destroyed");
		
	}
	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return config.getServletName()+" ";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Initialized");
		this.config=config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Request received");
		PrintWriter out= resp.getWriter();
		
		resp.setContentType("text/html");
		
		out.print("Welcome<br>");
		out.print(getServletInfo());
		out.print("<br> Details<br>");
		out.print("Content Length "+req.getContentLength()+"<br>");
		out.print("Content Type: "+req.getContentType());
		
	}

}
