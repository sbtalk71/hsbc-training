
/**
 * 
 * @author Shantanu Banerjee
 *
 */
public class Emp {

	private int empId;
	private String empName;
	private String city;
	private double salary;

	/**
	 * This method generates an info nbased on the given parameters
	 * @param empId this is employee Id
	 * @param empName name of the employee
	 * @param city residence city
	 * @param salary salary of the employee
	 */
	public Emp(int empId, String empName, String city, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmpDetails() {
		return empId + " " + empName + " " + city + " " + salary;
	}

	/*
	 * public void setEmpName(String empName) { this.empName = empName; }
	 */
}
