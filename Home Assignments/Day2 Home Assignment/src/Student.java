/**
 * 
 * @author Muskan Karnani
 * After overloading the contructor, if we remove the default constructor it will give us error
 * It means that whenever we overload constructor of a class, the compiler automatically omits the default constructor,
 * so to use the default constructor, we need to write a code for it especially. 
 *
 */
public class Student {
	public int id, marks;
	public String name;
	public Student()
	{
		id=0;
		marks=0;
		name="";
	}
	public Student(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public void display()
	{
		System.out.println("The student "+name+" with ID "+id+" has obtained "+marks+" marks.");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(1,"Muskan",90);
		s1.display();
		s2.display();
	}
}
