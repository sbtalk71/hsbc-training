package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;

public class MySqlDB implements MyConnection {

	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connection Established";
	}

	@Override
	public String getDbDetails() {
		// TODO Auto-generated method stub
		return "MySQL DB";
	}
}
