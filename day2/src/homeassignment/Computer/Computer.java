package homeassignment.Computer;

public class Computer {
	public static void main(String[] args) {
		Cpu ob1 = new Cpu();
		System.out.println(ob1.give());

		Monitor ob2 = new Monitor();
		System.out.println(ob2.give());

		Keyboard ob3 = new Keyboard();
		System.out.println(ob3.give());

		Mouse ob4 = new Mouse();
		System.out.println(ob4.give());

	}
}
