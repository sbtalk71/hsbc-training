package day4HA;

public class MainNestedTryCatch {

	public static void main(String[] args) {

		NestedTryCatch ob = new NestedTryCatch(2, 0);

		int a[] = { 1, 2, 3, 4 };
		try {
			System.out.println(a[4]);

			try {
				ob.NestedTryCatch();
			} catch (ArithmeticException e) {
				e.printStackTrace();

			}
		} catch (ArithmeticException e) {

			e.printStackTrace();
		}
	}
}
