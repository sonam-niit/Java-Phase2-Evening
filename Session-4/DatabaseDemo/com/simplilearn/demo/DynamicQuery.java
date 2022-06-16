package com.simplilearn.demo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicQuery {

	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String username="root";
		String password="Sonam@123";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Laptop Name");
		String name= sc.nextLine();
		System.out.println("Enter Price");
		BigDecimal price=sc.nextBigDecimal();
		try {
			//load the driver
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			
			if(conn!=null)
			{
				System.out.println("Connection Established");
				String query= "insert into eproduct (name, price) values (?,?)";
				PreparedStatement st= conn.prepareStatement(query);
				st.setString(1, name);
				st.setBigDecimal(2, price);
				int x= st.executeUpdate();
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
