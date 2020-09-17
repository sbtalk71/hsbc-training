// if we want to keep on doing the evaluation on a fixed number then we can use static else we should
// with non static

package homeassignment;

public class MyCalculator {

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		int a = 15, b = 6;

		MyCalculator ob = new MyCalculator();
		System.out.println(ob.add(a, b));
		System.out.println(ob.subtract(a, b));
		System.out.println(ob.multiply(a, b));		
		System.out.println(ob.divide(a, b));
	}

}
