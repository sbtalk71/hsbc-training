
public class Student {
	int id;
	String name;
	Student(){
		System.out.println("Default Constructor ");
	}
	Student (int id, String name){
		this.id=id;
		this.name=name;
		System.out.println(id + " "+ name);
	}

	
	public static void main(String[] arg ) {
		Student s =new Student();
		Student s1 =new Student(4,"supriya");
		
	}
}


//Creates an error stating "Constructor not defined"