/*Program to find factorial AND
 Populate a string array with 10 names and print each name with a greet  message*/
public class ClassWork {
	
	public int fact(int n)
	{
		int f=1;
		for(int i=2;i<=n;i++)
			f*=i;
		return f;
	}
	public static void main(String[] args) 
	{
		ClassWork ob=new ClassWork();
		//calculating factorial of 6
		int result=ob.fact(6);
		System.out.println("The factorial of 6 is "+result);
		//Print each name with greetings
		String names[]= {"MUSKAN","RIYA","PRIYA","KRISHNA","JOEY","CHARLOTTE","AJAY","AKSHAY","JOY","KRISH"};
		for(int i=0;i<names.length;i++)
			System.out.println("Hello "+names[i]+"! How are you doing?");
	}

}
