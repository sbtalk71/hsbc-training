package day2.classassignment;

public class BoxDemo {

	public static void main(String[] args) {

		System.out.println("Volume is called");
		Box b1 = new Box(10, 20, 30);
		System.out.println(b1.getVolume());
		System.out.println(b1.getColor());

		System.out.println("Color is called");
		Box b2 = new Box(10, 20, 30, "Red");
		System.out.println(b2.getVolume());
		System.out.println(b2.getColor());

		System.out.println("Weight is called");
		Box b3 = new Box(10, 20, 30, "Red", 5.6);
		System.out.println(b3.getVolume());
		System.out.println(b3.getColor());
		System.out.println(b3.getWeight());

	}

}
