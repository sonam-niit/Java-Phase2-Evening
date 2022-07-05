package com.flyaway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.flyaway.model.Customer;

public class CustomerDao {

	private Connection conn;

	public CustomerDao() {
		conn = DBConfig.getConnection();
	}

	public int saveCustomer(Customer cust) {
		try {
			PreparedStatement stat = conn
					.prepareStatement("insert into customer" + "(firstname,lastname,email,password) values (?,?,?,?)");

			stat.setString(1, cust.getFirstName());
			stat.setString(2, cust.getLastName());
			stat.setString(3, cust.getEmail());
			stat.setString(4, cust.getPassword());

			return stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
}
