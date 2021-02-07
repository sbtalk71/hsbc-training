/**
 * 
 * @author Muskan Karnani
 * BEHAVIOR OF STATIC VARIABLES WHEN ACCESSED FROM ORDINARY METHODS
 * If we talk about accessing static variables from ordinary methods, we can clearly see from this program
 *  that we can easily access the static variables from ordinary methods. 
 */
public class AccessStatic
{
	static int i=0;
	public void increment()
	{
		i++;
	}
	public static void main(String args[])
	{
		AccessStatic ob=new AccessStatic();
		ob.increment();
		/**
		 * We can access the static variable with any object or instance but it is not necessary to use it as all the instances of a class share the same static variable, 
		 * so the value of the static variable for all the objects is same
		 */
		System.out.println("Static variable value is "+i);
		/**
		 * We can access the static variable directly also as it is a Class variable
		 */
		System.out.println("Static variable value is "+AccessStatic.i);
		/**
		 * Also, we can access the static variable using the name of the class
		 */
		System.out.println("Static variable value is "+ob.i);
		
	}
}
