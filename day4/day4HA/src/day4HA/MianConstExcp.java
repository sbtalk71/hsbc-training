package day4HA;

public class MianConstExcp {

	public static void main(String[] args) {
		ConstExcp ob = new ConstExcp(2, 0);
		try {
			System.out.println(ob.ConstExcp());
		} catch (ArithmeticException e) {
			e.printStackTrace();

		}

	}

}
