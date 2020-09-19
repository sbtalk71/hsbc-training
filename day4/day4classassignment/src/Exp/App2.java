package Exp;

public class App2 {

	int a;
	int b;

	public App2(int a, int b) {
		this.a = a;
		this.b = b;
		// TODO Auto-generated constructor stub
	}

	public void divide(int a, int b) {
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {

			//e.printStackTrace();
			throw e;
		}

	}
}
