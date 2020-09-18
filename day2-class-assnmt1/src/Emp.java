
public class Emp {
	private int empId;
	private String name;

	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public void setEmpDetails(int id, String name) {
		this.empId=id;
		this.name=name;
	}
	public String getEmpInfo() {
		return empId + " " + name;
	}
}
