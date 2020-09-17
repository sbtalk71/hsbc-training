package homeassignment.EmpStud;

public class IncomeTaxDeductions {
	public static void main(String[] args) {
		Emp ob1 = new Emp(450000, "SWE");
		ob1.getDetails();

		double salary = ob1.getSalary();

		double tax = 5.0;

		double taxcalc = (tax / 100) * salary;

		System.out.println("Payable income tax is: " + taxcalc);
	}
}
