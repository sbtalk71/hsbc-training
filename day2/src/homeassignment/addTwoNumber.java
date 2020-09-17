package homeassignment;

public class addTwoNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		int g = a;

		if (a > b) {
			g = a;
		} else
			g = b;

		if (c > g) {
			g = c;
		}
		System.out.println("The greatest of all three is:"+g);
	}
}
