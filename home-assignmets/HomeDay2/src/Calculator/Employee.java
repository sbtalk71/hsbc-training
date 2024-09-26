package Calculator;

/**
 * 
 * @author Megha Agarwal
 *class with methods to calculate gross,net salary and income tax
 */
public class Employee {
	
	MyCalculator cal=new MyCalculator();
	private int empId;
	private String ename;
	private int salary;
	
	/**
	 * Constructor
	 * @param empId
	 * @param ename
	 * @param salary
	 */
  public Employee(int empId,String ename, int salary)
  {
	  this.empId=empId;
	  this.ename=ename;
	  this.salary=salary;
  }
	
	/**
	 * HRA=10% of basic salary
	 * DA=73% of basic salary
	 *GS=basic salary+DA+HRA
	 *Income tax=30% of gross salary
	 *net salary= GS-income tax
	 */
  public int getGrossSalary()
  {
	    int[] sum={cal.multiply(0.1, (double)this.salary), cal.multiply(0.73,this.salary), this.salary};
	  return cal.add(sum);
  }
  
  public int getIncomeTax()
  {
	  return cal.multiply(0.3,this.getGrossSalary());
  }
  
  public int getNetSalary()
  {
	  return cal.subtract(this.getGrossSalary(),this.getIncomeTax());
  }
  
  public String getEmpDetails()
  {
	  return this.empId+" "+this.ename+" "+this.getNetSalary();
  }
  
  
	public static void main(String[] args) {
		Employee e1=new Employee(101,"Krati",30000);
		e1.getEmpDetails();
		System.out.println("Net Salary: "+e1.getNetSalary());
		System.out.println("Income tax to be paid: "+e1.getIncomeTax());

	}

}
