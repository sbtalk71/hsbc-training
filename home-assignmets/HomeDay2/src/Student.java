/**
 * 
 * @author Megha agarwal
 *
 */

/*if i use the default constructor, 
 *  s object displayed the message,s1 object invoked the overloaded constructor.
 *  when default constructor deleted, s object could not instantiated
 *   as only parameterized constructor was available
 * 
 */
public class Student {
	
	private int sid;
	private String sname;
	/*public Student()
	{
		System.out.println("Hello, student object created!!");
	}*/
	
	public Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	
	public void displayInfo()
	{
		System.out.println(this.sid+" "+this.sname);
	}

	public static void main(String[] args)
	{
		//Student s=new Student();
		Student s1=new Student(101,"Josh");
		s1.displayInfo();
	}
}
