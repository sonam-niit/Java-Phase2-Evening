package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@WebServlet("/fetch")
public class FetchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		List<EProduct> list= session.createQuery("from EProduct").list();
		out.print("<h1>Product Data</h1>");
		out.print("<table border=1 cellspacing=0 cellpadding=10>");
		out.print("<tr><th>Id</th><th>Name</th><th>Price</th><th>Date</th>");
		out.print("<th>Harddisk</th><th>CPU</th><th>Ram</th></tr>");
		for(EProduct e:list)
		{
			ProductParts parts=e.getParts();
			out.print("<tr><td>"+e.getId()+"</td>");
			out.print("<td>"+e.getName()+"</td>");
			out.print("<td>"+e.getPrice()+"</td>");
			out.print("<td>"+e.getDateAdded()+"</td>");
			out.print("<td>"+parts.getHdd()+"</td>");
			out.print("<td>"+parts.getCpu()+"</td>");
			out.print("<td>"+parts.getRam()+"</td></tr>");
		}
		out.print("</table>");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
