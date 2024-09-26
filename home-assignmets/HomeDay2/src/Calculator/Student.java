package Calculator;

/**
 * 
 * @author Megha Agarwal
 * 
 *
 */
public class Student {
	
	private int sid;
	private String sname;
	private int[] marks;				//marks array have scores of as many subjects as required
	
	public Student(int sid,String sname,int[] marks)
	{
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
		
	}
	
	public int getResult()
	{
		MyCalculator cal=new MyCalculator();
		return cal.divide(cal.add(this.marks), this.marks.length);
		
		//divide sum by number of subjects to obtain average
		
	}
	public static void main(String[] args) {
		int[]  marks= {90,60,70};
		Student st1=new Student(100,"Joshi",marks);
		System.out.println("Average: "+st1.getResult());

	}

}