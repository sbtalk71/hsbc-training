package com.demo.reemote.cls;
import com.demo.reemote.TvRemote;

public class MainClass {

	public static void main(String[] args) {
		TvRemote tv=MyFactory.getTvFactory("Sony");
		
		//TvRemote tv=MyFactory.getTvFactory("Panasonic");
		
		//TvRemote tv=MyFactory.getTvFactory("Bpl");
		
		tv.start();
		tv.incVolume();
	}
}
