package com.demo.interfacedemo.cls;

import com.demo.interfacedemo.interfaces.*;

/**
 * 
 * @author hp
 *Main class to test behaviour of interface extending interface
 */
public class AppTester {
	public static void main(String[] args) {
		
		Ia a1=new ClsA();
		Ia a2=new ClsB();
		
		Ib a3=new ClsB();
		
		a1.getMssg();
		a2.getMssg();
		
		a3.getMssg();
		a3.getDayTip();
		
		
		
	}

}
