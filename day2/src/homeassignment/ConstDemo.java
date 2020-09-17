//Here without default constructor there will be error so must have it 

package homeassignment;

public class ConstDemo {

	public ConstDemo() {
		System.out.println("Default called");
	}

	public ConstDemo(int a) {
		System.out.println("int called");
	}

	public ConstDemo(double a) {
		System.out.println("double called");
	}
	public static void main(String[] args) {
		ConstDemo ob1=new ConstDemo();
		ConstDemo ob2=new ConstDemo(2);
		ConstDemo ob3=new ConstDemo(3.5);
		
	}

}
