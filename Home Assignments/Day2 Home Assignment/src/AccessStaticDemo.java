/**
 * 
 * @author Muskan Karnani
 *
 */
public class AccessStaticDemo {

	public static void main(String[] args) 
	{
		AccessStatic obj1=new AccessStatic();
		obj1.increment();
		AccessStatic obj2=new AccessStatic();
		obj2.increment();
		AccessStatic obj3=new AccessStatic();
		obj3.increment();
		/**
		 * we can access the static variable from other class only using the name of the Class in which it was declared 
		 */
		System.out.println("The value of static variable of the AccessStatic class is "+AccessStatic.i);
	}

}
