package homeassignment.EmpStud;

public class Emp {

	private double salary;
	private String it;

	public Emp(double salary, String it) {
		this.salary = salary;
		this.it = it;
	}

	public void getDetails() {
		System.out.println(salary + " " + it);
	}

	public double getSalary() {
		return salary;
	}

}
