package com.demo.interfaces;

import com.demo.BPLTv.BPLTv;
import com.demo.PanasonicTv.PanasonicTv;
import com.demo.SOnyTv.SonyTv;

public class MyConFactory {

	public static MyConnection getMyConnection(String tvsize) {
		if (tvsize.equals("55Inch TV"))
			return new BPLTv();
		else if (tvsize.equals("43Inch TV"))
			return new PanasonicTv();
		else if (tvsize.equals("32Inch TV"))
			return new SonyTv();
		else
			return null;

	}
}
