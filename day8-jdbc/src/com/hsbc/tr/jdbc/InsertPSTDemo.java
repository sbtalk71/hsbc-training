package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPSTDemo {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		String INSERT_SQL = "insert into emp (empno,name,city,salary) values(?,?,?,?)";
		try {
			// Load the Driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			// Get the Connection
			
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

			if (conn != null) {
				System.out.println("Got the Connection from "+conn.getClass().getName());
			}

			pst=conn.prepareStatement(INSERT_SQL);
			
			pst.setInt(1, 101);
			pst.setString(2, "Ankit");
			pst.setString(3, "Bangalore");
			pst.setDouble(4, 65000);
			
			int rowCount=pst.executeUpdate();
			
			if (rowCount == 1) {
				System.out.println("1 Row inserted...");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver could not be Found..");

		} catch (SQLException ex) {
			System.out.println("Exception : " + ex);
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
