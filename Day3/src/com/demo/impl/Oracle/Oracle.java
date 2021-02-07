package com.demo.impl.Oracle;
import com.demo.interfaces.MyConnection;

public class Oracle implements MyConnection {
	@Override
	public String  getConnectionInfo() {
		return "Connection is established";
	}
	@Override
	 public String  getDbDetails()
	 {
		 return "Oracle DB 13C";
	 }

}
