package homeassignment.EmpStud;

public class Stud {

	private double total;
	private double average;
	private String result;

	public Stud(double total, double average, String result) {
		this.total = total;
		this.average = average;
		this.result = result;

	}

	public void getDetails() {
		System.out.println(total + " " + average + " " + result);
	}

}
