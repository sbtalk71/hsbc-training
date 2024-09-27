package home.assignments;

public class SonyTv implements TvRemote {

	@Override
	public String screenSize() {
		System.out.println("HELLO! THIS IS SONY BRAND TV!");
		return "THE SCREEN SIZE IS VARY FROM SMALL TO LARGE";
	}

	@Override
	public String displayQuality() {
		return "ITS DISPLAY QUALITY IS AMAZING";
	}

	@Override
	public String type() {
		return "ITS TYPE RANGES FROM SMALL TO LARGE";
	}

}
