package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		String name= request.getParameter("name");
		BigDecimal price= new BigDecimal(request.getParameter("price"));
		String hdd= request.getParameter("hdd");
		String cpu= request.getParameter("cpu");
		String ram= request.getParameter("ram");
		
		ProductParts parts= new ProductParts(hdd, ram, cpu);
		EProduct product= new EProduct(name, price, new Date(), parts);

		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(product);
		
		tx.commit();
		
		response.sendRedirect("fetch");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
