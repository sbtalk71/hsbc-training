
public class Employee_Student {
	public double maths, science, english, res, paytaxamt;
	public String name;
	public Employee_Student(String name,double maths, double science, double english)
	{
		this.name=name;
		this.maths=maths;
		this.english=english;
		this.science=science;
	}
	public Employee_Student(String name,double paytaxamt)
	{
		this.name=name;
		this.paytaxamt=paytaxamt;
	}
	public static void main(String[] args) {
		Employee_Student stu=new Employee_Student("MUSKAN",100,85,95);
		MyCalculator ob=new MyCalculator();
		stu.res=(ob.add(stu.maths, stu.science, stu.english))/3;
		System.out.println("The student "+stu.name+" has scored "+stu.res+"% result");
		
	}
}
