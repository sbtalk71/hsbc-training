package day4HA;

public class NestedApp {
	public static void main(String[] args) {

		try {

			int a[] = { 1, 2, 3 };

			System.out.println(a[5]);

			try {

				int x = 5 / 0;
			} catch (ArithmeticException e2) {
				System.out.println("Division by zero is not possible");
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");

		}
	}
}
