package com.demo.BPLTv;

import com.demo.interfaces.MyConnection;

public class BPLTv implements MyConnection {

	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connected";
	}

	@Override
	public String getSizeDetails() {
		// TODO Auto-generated method stub
		return "55Inch TV";
	}

}
