
public class Student1 {

	public static void main(String[] args) {
		MyCalculator s = new MyCalculator();
		int total=s.Add(80,80,80,80);
		System.out.println("Total marks ="+total);
		int avg =s.Divide(total, 4);
		int result = s.Divide(s.Multiply(total, 100),400);
		System.out.println("Result ="+result+"%");

	}

}
