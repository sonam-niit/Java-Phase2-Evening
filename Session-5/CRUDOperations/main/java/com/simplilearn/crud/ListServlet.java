package com.simplilearn.crud;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		InputStream in= getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		Properties props= new Properties();
		props.load(in);
		Connection con= DBConfig.getConnection(props);
		try {
			PreparedStatement pst= con.prepareStatement("select * from eproduct");
			ResultSet rs= pst.executeQuery();
			out.print("<h1>Products Page</h1>");
			out.print("<table border=1 cellpadding=10 cellspacing=0>"
					+ "<tr><th>Id</th><th>Name</th><th>Price</th><th>Date</th>"
					+ "<th colspan=2>Operation</th></tr>");
			while(rs.next())
			{
				out.print("<tr>");
				out.print("<td>"+rs.getInt(1)+"</td>");
				out.print("<td>"+rs.getString(2)+"</td>");
				out.print("<td>"+rs.getBigDecimal(3)+"</td>");
				out.print("<td>"+rs.getTimestamp(4)+"</td>");
				out.print("<td><a href='delete?id="+rs.getInt(1)+"'>Delete</a></td>");
				out.print("<td><a href='updatepage?id="+rs.getInt(1)+"'>Update</a></td>");
				out.print("</tr>");
			}
			out.print("</table>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
