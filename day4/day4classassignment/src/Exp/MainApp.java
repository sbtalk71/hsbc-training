package Exp;

public class MainApp {
	public static void main(String[] args) {
		App1 a1 = new App1();
		try {
			a1.calculate(7, 0);
		} catch (ArithmeticException e) {
			System.out.println("Divided by Zero");
		}
		System.out.println("Done Successfully");
	}

}
