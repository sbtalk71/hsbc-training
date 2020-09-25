package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		String Select_SQL = "select empno,name,salary,city from emp where empno=?";
		try {

			Class.forName("org.apache.derby.jdbc.ClientDriver");

			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

			pst = conn.prepareStatement(Select_SQL);
			pst.setInt(1, 101);

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("EMPNO");
				String name = rs.getString("NAME");
				String city = rs.getString("CITY");
				double salary = rs.getDouble("SALARY");
				System.out.println(id + " " + name + " " + city + " " + salary);
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
