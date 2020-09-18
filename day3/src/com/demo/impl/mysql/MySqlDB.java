package com.demo.impl.mysql;

import com.demo.interfaces.MyConnection;

public class MySqlDB implements MyConnection {

	@Override
	public String getConnectionInfo() {

		return "Connection establised successfully";
	}

	@Override
	public String getDbDetails() {

		return "MySQL DB 8.3";
	}
}
