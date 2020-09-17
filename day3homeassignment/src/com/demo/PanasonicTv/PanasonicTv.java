package com.demo.PanasonicTv;

import com.demo.interfaces.MyConnection;

public class PanasonicTv implements MyConnection {

	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connected";
	}

	@Override
	public String getSizeDetails() {
		// TODO Auto-generated method stub
		return "43Inch TV";
	}

}
