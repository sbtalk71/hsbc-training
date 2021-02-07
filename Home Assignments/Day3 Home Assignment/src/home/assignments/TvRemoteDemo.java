package home.assignments;

public class TvRemoteDemo {

	public static void main(String[] args) {
		BplTv bpl=new BplTv();
		SonyTv sony=new SonyTv();
		PanasonicTv pan=new PanasonicTv();
		System.out.println(bpl.screenSize());
		System.out.println(bpl.displayQuality());
		System.out.println(bpl.type());
		System.out.println();
		System.out.println(sony.screenSize());
		System.out.println(sony.displayQuality());
		System.out.println(sony.type());
		System.out.println();
		System.out.println(pan.screenSize());
		System.out.println(pan.displayQuality());
		System.out.println(pan.type());
	}

}
