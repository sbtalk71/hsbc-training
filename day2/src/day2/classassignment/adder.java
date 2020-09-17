package day2.classassignment;

public class adder {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Please enter at least two no");
		} else {
			double s = 0;
			for (int i = 0; i < args.length; i++) {
				s = s + Integer.parseInt(args[i]);
			}
			System.out.println("Sum of the vlaues are:"+s);
		}
	}
}
