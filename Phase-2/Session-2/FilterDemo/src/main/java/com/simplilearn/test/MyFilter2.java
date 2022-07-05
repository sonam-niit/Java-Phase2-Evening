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
public class MyFilter2 implements Filter {

	private FilterConfig fConfig;
	public void destroy() {
		System.out.println("Filter 2 destroyed");
		fConfig=null;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("Pre filteration of Second Filter<br>");
		
		chain.doFilter(request, response);
		
		out.print("Post Filteration of Second Filter<br>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig=fConfig;
	}

}
