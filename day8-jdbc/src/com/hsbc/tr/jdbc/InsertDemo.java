package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String INSERT_SQL = "insert into emp (empno,name,city,salary) values(100,'Shantanu','Hyderabad',45000)";
		try {
			// Load the Driver
			//Class.forName("org.apache.derby.jdbc.ClientDriver");
			// Get the Connection
			
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

			if (conn != null) {
				System.out.println("Got the Connection..");
			}

			stmt = conn.createStatement();

			int rowCount = stmt.executeUpdate(INSERT_SQL);
			
			if (rowCount == 1) {
				System.out.println("1 Row inserted...");
			}

		} /*
			 * catch (ClassNotFoundException e) {
			 * System.out.println("Driver could not be Found..");
			 * 
			 * }
			 */ catch (SQLException ex) {
			//System.out.println("Exception : " + ex);
				 ex.printStackTrace();
		}

		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
