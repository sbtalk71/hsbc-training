package com.demo.impl.oracle;

import com.demo.interfaces.MyConnection;

public class MySql  implements MyConnection {

	@Override
	public String getConnectionInfo() {
		return "Connection established successfully";
		}

	@Override
	public String getDbDetails() {
		return "MySqL DB 8.3c";
	}
	

}
