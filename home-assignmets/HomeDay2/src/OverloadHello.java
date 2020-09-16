/**
 * 
 * @author Megha Agarwal
 * Program to see the behaviour of overloading hello()
 *
 */

//hello(int i) was invoked because integer type value was passed. 
//In absence of this method,long hello method might get invoked.

public class OverloadHello {

	public void hello(int i)
	{
		System.out.println("Integer parameter "+i);
	}
	
	public void hello(byte i)
	{
		System.out.println("Byte type parameter "+i);
	}
	
	public void hello(short i)
	{
		System.out.println("short integer parameter "+i);
	}
	
	public void hello(long i)
	{
		System.out.println("long integer parameter "+i);
	}
	
	public static void main(String[] args) {
		OverloadHello h=new OverloadHello();
		h.hello(5);

	}

}


