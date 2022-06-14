package com.simplilearn.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/welcome")
public class MyFilter1 implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("Pre filteration of First Filter<br>");
		
		chain.doFilter(req, res);
		
		out.print("Post Filteration of First Filter<br>");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Filter Destroyed");
	}
}
