package com.hsbc.tr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {

	public static void main(String[] args) {

		Connection conn = null;
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			// Get the Connection
			
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

			Statement stmt = conn.createStatement();
			//conn.setAutoCommit(false);

			
			stmt.addBatch("insert into emp (empno,name,city,salary) values (125,'Arun','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,city,salary) values (126,'Seema','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,city,salary) values (127,'Chndra','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,city,salary) values (118,'Parul','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,city,salary) values (123,'Raman','Hyderabad',67000)");
			stmt.addBatch("insert into emp (empno,name,city,salary) values (129,'Tiger','Hyderabad',67000)");
			
			

			int[] count = stmt.executeBatch();
			//conn.commit();
			System.out.println("Transaction success with count "+count.length);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				
				conn.rollback();
				System.out.println("Rolling back Tx");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
