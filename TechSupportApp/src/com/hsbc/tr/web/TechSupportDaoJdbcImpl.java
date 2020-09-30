package com.hsbc.tr.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TechSupportDaoJdbcImpl implements TechSupportDao {

	@Override
	public int checkUser(String email) {
		Connection conn = null;
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select email from CUSTOMERS where email=?");
			pst.setString(1, email);

			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return 1;
			} else {
				return 0;
			}

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		// return e;
	}

	@Override
	public String saveRequest(String email, String os, String software, String problem) {
		Connection conn = null;
		try {
				conn = getConnection();
				PreparedStatement pst = conn
						.prepareStatement("insert into SUPP_REQUESTS(EMAIL,OS,SOFTWARE,PROBLEM) values(?,?,?,?)");

				pst.setString(1, email);
				pst.setString(2, os);
				pst.setString(3, software);
				pst.setString(4, problem);

				int rowCount = pst.executeUpdate();

				return "success";
			

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}

	@Override
	public String saveUser(String email, String fname, String lname, String phone) {
		Connection conn = null;
		try {
				conn = getConnection();
				PreparedStatement pst = conn
						.prepareStatement("insert into CUSTOMERS(EMAIL,FNAME,LNAME,PHONE) values(?,?,?,?)");

				pst.setString(1, email);
				pst.setString(2, fname);
				pst.setString(3, lname);
				pst.setString(4, phone);

				int rowCount = pst.executeUpdate();

				return "success";
			

		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
	}

	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");

			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/demodb");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver could not be Found..");

		} catch (SQLException ex) {
			System.out.println("Exception : " + ex);
			ex.printStackTrace();
			throw ex;
		}

		return conn;

	}

	@Override
	public List<String> listAllRequests() {
		Connection conn = null;
		List<String> reqList=new ArrayList<String>();
		try {
			conn = getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from SUPP_REQUESTS");
			

			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				reqList.add(rs.getString("REQUEST_ID")+" "+rs.getString("EMAIL")+" "
			+rs.getString("OS")+" "+rs.getString("PROBLEM")+" "+rs.getString("SOFTWARE"));
			} 
			return reqList;

		} catch (SQLException ex) {
			// ex.printStackTrace();
			throw new RuntimeException(ex);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e3) {
				e3.printStackTrace();
			}
		}
		// return e;
	}

}
