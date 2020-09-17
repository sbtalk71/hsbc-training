
package homeassignment;

public class Hello {

	public void hello(int i) {
		System.out.println("int called");
		System.out.print("The reason is because it matches the type");
	}

	public void hello(byte i) {
		System.out.println("byte called");
	}

	public void hello(short i) {
		System.out.println("short called");
	}

	public void hello(long i) {
		System.out.println("long called");
	}

	public static void main(String[] args) {
		Hello ob1 = new Hello();
		ob1.hello(5);
	}

}
