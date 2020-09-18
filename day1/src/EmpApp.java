
public class EmpApp {
	
	Emp e=new Emp(100, "Shantanu", "Hyderabad", 34000);;
	
	public Emp getEMp() {
		return e;
	}
	public static void main(String[] args) {
		//Emp e=new Emp();
		
		 
		
		EmpApp app= new EmpApp();
		
		/*
		 * e.empId=123; e.empName="Shantanu"; e.city="Hyderabad"; e.salary=20000;
		 */
		
		Emp emp=app.getEMp();
		System.out.println(emp.getEmpDetails());
		
		//String info=e.getEmpDetails();
		//System.out.println(info);
		
		//e.setCity("bangalore");
		//e.setEmpName("Scott");
		//String info1=e.getEmpDetails();
		//System.out.println(info1);

	}

}
