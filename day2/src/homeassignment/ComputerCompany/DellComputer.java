
package homeassignment.ComputerCompany;

public class DellComputer {
	private String mouse;
	private String keyboard;
	private String cpu;
	private String monitor;

	public DellComputer() {

	}

	public DellComputer(String mouse, String keyboard, String cpu, String monitor) {
		this.mouse = mouse;
		this.monitor = monitor;
		this.cpu = cpu;
		this.keyboard = keyboard;
	}

	public String mouse() {

		this.mouse = "Dell mouse";

		return mouse;
	}

	public String keyboard() {

		this.keyboard = "Dell keyboard";

		return keyboard;
	}

	public String cpu() {

		this.cpu = "Dell cpu";

		return cpu;
	}

	public String monitor() {
		this.monitor = "Dell monitor";
		return monitor;
	}

}
