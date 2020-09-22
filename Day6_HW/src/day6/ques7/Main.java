package day6.ques7;

public class Main {

	public  synchronized static void main(String[] args) {
	PrintMessage obj =new PrintMessage();
	
	Employee e1 =new Employee(obj," HSBC");
	Employee e2 =new Employee(obj," Pune");
	Employee e3 =new Employee(obj," India");
	
	e1.run();
	e2.run();
	e3.run();
	}

}
