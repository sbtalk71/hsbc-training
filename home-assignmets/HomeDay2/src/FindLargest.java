/**
 * 
 * @author Megha agarwal
 *
 */
public class FindLargest {
	
	/**
	 * 
	 * @param args
	 * we will take numbers to compare as command line arguments
	 */

	public static void main(String[] args) {
		if(args.length<3)
			System.out.println("Please provide 3 numbers!!");
		else
		{
			int num,x,y,z;
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			z=Integer.parseInt(args[2]);
			num=x>y?(x>z?x:z):(y>z?y:z);				
													//using nested conditional operator
			System.out.println("Largest number=  "+num);
		}
		

	}

}
