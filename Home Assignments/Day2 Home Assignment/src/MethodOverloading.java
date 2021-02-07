/**
 * 
 * @author Muskan Karnani
 * Test method overloading in different ways
 *
 */
public class MethodOverloading 
{
	//Overloading when the number of parameters are different
	 public void display(char c)
	    {
	         System.out.println(c);
	    }
	    public void display(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	    
	    //Overloading when the data types of the parameters are different
	    public void display1(char c)
	    {
	        System.out.println(c);
	    }
	    public void display1(int c)
	    {
	       System.out.println(c );
	    }
	    //Overloading when sequence of the parameters are different
	    public void display2(char c, int num)
	    {
	        System.out.println("I’m the first definition of method disp");
	    }
	    public void display2(int num, char c)
	    {
	        System.out.println("I’m the second definition of method disp" );
	    }
	   public static void main(String args[])
	   {
	       MethodOverloading obj = new MethodOverloading();
	       obj.display('a');
	       obj.display('a',10);
	       obj.display1('a');
	       obj.display1(5);
	       obj.display2('x', 51 );
	       obj.display2(52, 'y');

	   }
	

}
