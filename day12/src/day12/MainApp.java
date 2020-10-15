/*
 * @author Devyansh Ojha
 */

package day12;

public class MainApp {
	public static void main(String[] args) {
		Greeter obj = new Greeter();
		obj.greet(new GoodMorning());

		obj.greet(new GreetMessage() {

			@Override
			public String greetMessage() {
				return "hello";
			}
		});

		obj.greet(() -> "Hello2");// since one liner so no return

	}
}

class GoodMorning implements GreetMessage {
	@Override
	public String greetMessage() {

		return "Good Morning";
	}
}
