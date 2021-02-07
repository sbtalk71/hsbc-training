package com.demo.reemote.cls;
import com.demo.reemote.TvRemote;

public class SonyTv implements TvRemote{
	@Override
	public void start() {
		System.out.println("Starting Sony Tv..Welcome");
	}
	
	@Override
	public void incVolume() {
		System.out.println("Increasing volume by 2");
		
	}

}
