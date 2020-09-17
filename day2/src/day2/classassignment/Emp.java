package day2.classassignment;

public class Emp {

	private int empId;
	private String empName;

	public Emp() {

	}

	public Emp(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpid() {
		return empId;
	}

	public String getEmpInfo() {
		return empId + " " + empName;
	}
}
