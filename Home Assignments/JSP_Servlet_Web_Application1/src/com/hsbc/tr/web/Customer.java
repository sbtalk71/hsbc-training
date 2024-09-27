/**
 * @author Muskan Karnani
 * this is the entity class named Customer
 */


package com.hsbc.tr.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

public class Customer {
	private static int requestId=1;
	private String fname;
	private String lname;
	private String phone;
	private String email;
	private String os,problem,software;
	public void setRequestId() {
		requestId++;
	}
	public static int getRequestId() {
		return requestId;
	}
	public Customer() {
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	
	public String validateData(String email)
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		String sql="select fname from Customers where email=?";
		try
		{
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			//Get the connection
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");
			/*/if(conn!=null)
			{
				System.out.println("Got the Connection!!");
			}*/
			stmt=conn.prepareStatement(sql);
			
			stmt.setString(1, email);

			ResultSet rs=stmt.executeQuery();
			
			if(rs.next())
				return "success";
			else
				return "failure";
			 
		}catch(SQLException e)
		{
			System.out.println(e);
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	public String saveData(String email, String software, String os, String problem)
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		String sql="insert into  supp_requests(request_id, email, software, os, problem) values(?, ?, ?, ?, ?)";
		try
		{
			//load the driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			//Get the connection
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");
			//System.out.println(getRequestId());
			stmt=conn.prepareStatement(sql);
			stmt.setInt(1, getRequestId()+(int)Math.random());
			stmt.setString(2, email);
			stmt.setString(3, software);
			stmt.setString(4, os);
			stmt.setString(5, problem);

			
			int rowCount=stmt.executeUpdate();
			return "success";
		
		}catch(SQLException ex) {
			System.out.println("Exception :"+ex);
			throw new RuntimeException(ex);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			try {
				if(conn!=null)
					conn.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	public String registerData(String email, String fname, String lname, String phone)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="insert into Customers (email, fname, lname, phone) values(?, ?, ?, ?)"; 
		try
		{
			//load the driver
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			//Get the connection
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");
			/*if(conn!=null)
			{
				System.out.println("Got the Connection!!");
			}*/
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.setString(2,fname);
			pstmt.setString(3,lname);
			pstmt.setString(4,phone);
			
			
			int rowCount=pstmt.executeUpdate();
			
				return "success";
			
		}catch(SQLException ex) {
			System.out.println("Exception :"+ex);
			throw new RuntimeException(ex);
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			try {
				if(conn!=null)
					conn.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	
	}
		
	
	
	

}
