package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;

public class MySqlDB implements MyConnection{
	@Override
	
	public String  getConnectionInfo() {
		return "Connection is established";
	}
	@Override
	 public String  getDbDetails()
	 {
		 return "MySql DB 13C";
	 }

}


