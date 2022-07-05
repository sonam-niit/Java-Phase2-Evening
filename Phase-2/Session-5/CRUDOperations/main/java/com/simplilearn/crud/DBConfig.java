package com.simplilearn.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConfig {

	public static Connection getConnection(Properties props)
	{
		Connection conn=null;
		try {
			//load the driver
			Class.forName(props.getProperty("driver"));
			conn = DriverManager.getConnection(props.getProperty("url"), 
					props.getProperty("username"), 
					props.getProperty("password"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
