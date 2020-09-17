package com.demo.reemote.cls;
import com.demo.reemote.TvRemote;

public class BplTv implements TvRemote{
	
	@Override
	public void incVolume() {
		System.out.println("Increased volume");
		
	}

	@Override
	public void start() {
		System.out.println("Bpl Tv");
		
	}
}
