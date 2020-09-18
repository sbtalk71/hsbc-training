package day3.hw.a1;

public class Main {

	public static void view(Bird b) {
		System.out.println(b.Wings());
	}

	public static void main(String[] args) {
		Bird b = new Parrot();
		Bird b1 = new Eagle();
		Bird b2 = new Duck();

		view(b);
		view(b1);
		view(b2);

	}

}
