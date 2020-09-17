package com.demo.SOnyTv;

import com.demo.interfaces.MyConnection;

public class SonyTv implements MyConnection {

	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connected";
	}

	@Override
	public String getSizeDetails() {
		// TODO Auto-generated method stub
		return "32Inch TV";
	}

}
