package homeassignment.ComputerCompany;

public class Computer {
	public static void main(String[] args) {
		DellComputer ob1 = new DellComputer();
		LenovoComputer ob2 = new LenovoComputer();

		System.out.println(ob1.mouse());
		System.out.println(ob2.keyboard());
		System.out.println(ob2.cpu());
		System.out.println(ob1.monitor());

	}
}
