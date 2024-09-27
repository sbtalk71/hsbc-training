
public class IncomeTaxDeductions
{
	public double payablelAmt(Employee_Student ob)
	{
		return ob.paytaxamt;
	}
	public static void main(String[] args) {
		IncomeTaxDeductions x=new IncomeTaxDeductions();
		Employee_Student ob=new Employee_Student("MUSKAN",2506660);
		System.out.println("The payable amount of the employee "+ob.name+" is : "+ x.payablelAmt(ob));
	}

}
