package day3.demo.db.cls;

public class Emp {
	
	private int empId;
	private String ename;
	
  public Emp(int empId,String ename)
  {
	  this.empId=empId;
	  this.ename=ename;
  }


	public String getEname() {
		return ename;
	}
	
	public int getEmpId()
	{
		return empId;
	}

}
