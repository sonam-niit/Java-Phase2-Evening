package com.simplilearn.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		//user redirected here so let's try to access cookies here
		Cookie ck[]=request.getCookies();
		boolean found=false;
		Cookie myCookie=null;
		out.print("<h1>Profile Page</h1>");
		if(ck!=null)
		{
			for(int i=0; i<ck.length;i++)
			{
				myCookie=ck[i];
				if(myCookie.getName().contentEquals("logindetails") 
						&& myCookie.getValue()!=null)
				{
					out.print("Cookie Found Value is  "+myCookie.getValue());
					found=true;
				}
			}
		}
		
		if(found==false)
			out.print("User is Invalid Kindly Login First");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
