package day3.hw.a2;

public class Main {

	public static void main(String[] args) {
		/*
		 * TvRemote tr1 = new BPLTv(); TvRemote tr2 = new SonyTv(); TvRemote tr3 = new
		 * PanasonicTv();
		 * 
		 * System.out.println(tr1.remote()); System.out.println(tr2.remote());
		 * System.out.println(tr3.remote());
		 */

		TvRemote tr = MyFactory.getRemote("bpl");
		System.out.println(tr.remote());

	}

}
