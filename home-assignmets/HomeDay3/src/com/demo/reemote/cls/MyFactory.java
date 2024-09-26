package com.demo.reemote.cls;
import com.demo.reemote.TvRemote;

public class MyFactory {
	
	public static TvRemote getTvFactory(String brand)
	{
		if(brand.equals("Bpl"))
			return new BplTv();
		
		else if(brand.equals("Sony"))
			return new SonyTv();
		
		else if(brand.equals("Panasonic"))
			return new PanasonicTv();
		
		else
			return null;
	}

}
