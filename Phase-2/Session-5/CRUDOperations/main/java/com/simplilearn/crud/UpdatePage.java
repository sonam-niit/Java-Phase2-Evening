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

@WebServlet("/updatepage")
public class UpdatePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		int id= Integer.parseInt(request.getParameter("id"));
		
		InputStream in= getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		Properties props= new Properties();
		props.load(in);
		Connection con= DBConfig.getConnection(props);
		try {
			PreparedStatement pst= con.prepareStatement("select * from eproduct where id=?");
			pst.setInt(1, id);
			
			ResultSet rs= pst.executeQuery();
			rs.next();
			
			out.print("<h1>User update Page</h1>");
			out.print("<form action='update' method='post'>");
			out.print("<input type='hidden' name='id' value='"+rs.getInt(1)+"'>");
			out.print("Name: <input type='text' name='pname' value='"+rs.getString(2)+"'><br><br>");
			out.print("Price: <input type='text' name='pprice' value='"+rs.getBigDecimal(3)+"'><br><br>");
			out.print("<input type='submit' value='save'></form> ");
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
