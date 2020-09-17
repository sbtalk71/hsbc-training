package com.demo.reemote.cls;
import com.demo.reemote.TvRemote;

public class PanasonicTv implements TvRemote{
	@Override
	public void start() {
		System.out.println("Welcome to panasonic...");
		
	}
	@Override
	public void incVolume() {
		System.out.println("Increased volume by 1");
	}
	
	
	

}
