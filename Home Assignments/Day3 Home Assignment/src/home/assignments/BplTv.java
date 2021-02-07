package home.assignments;

public class BplTv implements TvRemote {

	@Override
	public String screenSize() {
		System.out.println("HELLO! THIS IS BPL BRAND TV!");
		return "THE SCREEN SIZE IS USUALLY SMALL";
	}

	@Override
	public String displayQuality() {
		return "ITS DISPLAY QUALITY IS AWESOME";
	}

	@Override
	public String type() {
		return "IT IS OF NORMAL TYPE";
	}

}
