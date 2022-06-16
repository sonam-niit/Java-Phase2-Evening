package com.simplilearn.demo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataRetrival {

	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String username="root";
		String password="Sonam@123";
		
		try {
			//load the driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			
			if(conn!=null)
			{
				System.out.println("Connection Established");
				String query= "select * from eproduct";
				PreparedStatement st= conn.prepareStatement(query);
				
				ResultSet result=st.executeQuery();
				while(result.next())
				{
					System.out.println(result.getInt("id")+" "+result.getString("name")+
					" "+result.getBigDecimal(3)+" "+result.getTimestamp(4));
				}
				
			}
			else
				System.out.println("Error while connecting with Database");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
