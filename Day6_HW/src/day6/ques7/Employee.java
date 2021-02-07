package day6.ques7;

public class Employee implements Runnable {
	private PrintMessage obj;
	private  String message;
	
	public Employee(PrintMessage obj, String message) {
		this.obj=obj;
		this.message=message;
	}

	@Override
	public void run() {
		obj.print(message);
		
	}
	

}
