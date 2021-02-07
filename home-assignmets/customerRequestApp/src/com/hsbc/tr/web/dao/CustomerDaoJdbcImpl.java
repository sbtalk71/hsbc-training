package com.hsbc.tr.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Megha agarwal
 * Class implemeting dao interface
 *
 */
public class CustomerDaoJdbcImpl implements CustomerDao {

	/**
	 * Method to get connection object to derby database
	 * @return
	 */
	public Connection getConnect() {
		Connection con=null;
		try {
		
		Class.forName("org.apache.derby.jdbc.ClientDriver");

		// get the connection
		 con = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");
		 
		 System.out.println(con);
		
	} catch (ClassNotFoundException ce) {
		System.out.println("Driver could not be found");
	} catch (SQLException sx) {
		System.out.println(sx);
	}
		
		return con;

	}
	
	public void registerUser(String email,String fname, String lname, String pno) {
		Connection con=getConnect();
		String INSERT_SQL="insert into customers values(?,?,?,?)";
		try {
			
			PreparedStatement pst=con.prepareStatement(INSERT_SQL);
			
			//passing values for ?
			
			pst.setString(1, email);
			pst.setString(2, fname);
			pst.setString(3, lname);
			pst.setString(4, pno);
			
			//executing query, return number of rows affected
			int rowCount=pst.executeUpdate();
			
		} catch (SQLException sx) {
			System.out.println(sx);
		} finally {
			try {
				if (con != null)
					con.close();
			}
			catch (SQLException sx) {
				sx.printStackTrace();
			}

		}
	}
	
	@Override
	public String checkUser(String email) {
		Connection con=getConnect();
		String res=null;
		String SELECT_SQL="select fname,lname from Customers where email=?";
		try {
		PreparedStatement pst = con.prepareStatement(SELECT_SQL);
		pst.setString(1,email);
		
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			String fname=rs.getString("fname");
			String lname=rs.getString("lname");
			res=fname+" "+lname;
		}
		
		}
		catch (SQLException sx) {
			System.out.println(sx);
		}
		return res;
	}
	
	@Override
	public void saveRequest(String email, String software,String os, String problem) {
		Connection con=getConnect();
		String INSERT_SQL="insert into supp_requests (email,software,os,problem) values(?,?,?,?)";
		try {
			
			PreparedStatement pst=con.prepareStatement(INSERT_SQL);
			
			//passing values for ?
		
			pst.setString(1, email);
			pst.setString(2, software);
			pst.setString(3, os);
			pst.setString(4, problem);
			
	
			//executing query, return number of rows affected
			int rowCount=pst.executeUpdate();
			
			if(rowCount==1)
				System.out.println("1 row inserted!!");
		} catch (SQLException sx) {
			System.out.println(sx);
		} finally {
			try {
				if (con != null)
					con.close();
			}
			catch (SQLException sx) {
				sx.printStackTrace();
			}

		}
		
	}

}
