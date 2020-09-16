/**
 * 
 * @author Muskan Karnani
 * To check if we call hello(5) which method will be invoked
 * Here, the hello(int i) was invoked as we have passed an integer value,
 * in case hello(int i) not have been there, it would have called hello(long i) because the next higher preference data type after int is long
 *
 */
public class HelloDemo {
	public void hello(int i)
	{
		System.out.println("I am the integer one!");
	}
	public void hello(byte i)
	{
		System.out.println("I am the byte one!");
	}
	public void hello(short i)
	{
		System.out.println("I am the short one!");
	}
	public void hello(long i)
	{
		System.out.println("I am the long one!");
	}
	public static void main(String[] args) {
		HelloDemo ob=new HelloDemo();
		ob.hello(5);
	}
}
