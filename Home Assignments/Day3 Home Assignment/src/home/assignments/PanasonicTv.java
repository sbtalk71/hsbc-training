package home.assignments;

public class PanasonicTv implements TvRemote {

	@Override
	public String screenSize() {
		System.out.println("HELLO! THIS IS PANASONIC BRAND TV!");
		return "THE SCREEN SIZE IS USUALLY LARGE";
	}

	@Override
	public String displayQuality() {
		return "ITS DISPLAY QUALITY IS HIGH";
	}

	@Override
	public String type() {
		return "IT IS OF NORMAL TYPE";
	}

}
