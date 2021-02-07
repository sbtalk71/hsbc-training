package com.demo.interfacedemo.cls;
import com.demo.interfacedemo.interfaces.Ib;


public class ClsB implements Ib {
	
	@Override
	public void getMssg()
	{
		System.out.println("This class implements both interfaces Ia and Ib");
	}
	
	@Override
	public void getDayTip()
	{
		System.out.println("Better to try every concept practically!!");
	}

}
