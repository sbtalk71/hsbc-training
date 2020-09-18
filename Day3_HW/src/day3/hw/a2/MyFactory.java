package day3.hw.a2;

public class MyFactory {

	public static TvRemote getRemote(String type) {
		if (type.equals("sony"))
			return new SonyTv();
		else if (type.equals("panasonic"))
			return new PanasonicTv();
		else if (type.equals("bpl"))
			return new BPLTv();
		else
			return null;
	}

}
