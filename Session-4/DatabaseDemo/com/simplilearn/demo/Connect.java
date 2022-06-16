package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

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
				Statement st= conn.createStatement();
				int x=st.executeUpdate("insert into eproduct(name, price) values ('Lenovo thinkpad',67000)");
				if(x>0)
					System.out.println("Data inserted into database");
				else
					System.out.println("Error while inserting data");
			}
			else
				System.out.println("Error while connecting with Database");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
