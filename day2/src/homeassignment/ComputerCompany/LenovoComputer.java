
package homeassignment.ComputerCompany;

public class LenovoComputer {
	private String mouse;
	private String keyboard;
	private String cpu;
	private String monitor;

	public LenovoComputer() {

	}

	public LenovoComputer(String mouse, String keyboard, String cpu, String monitor) {
		this.mouse = mouse;
		this.monitor = monitor;
		this.cpu = cpu;
		this.keyboard = keyboard;
	}

	public String mouse() {

		this.mouse = "Lenovo mouse";

		return mouse;
	}

	public String keyboard() {

		this.keyboard = "Lenovo keyboard";

		return keyboard;
	}

	public String cpu() {

		this.cpu = "Lenovo cpu";

		return cpu;
	}

	public String monitor() {

		return monitor;
	}

}
