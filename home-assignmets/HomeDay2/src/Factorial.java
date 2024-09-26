/**
 * 
 * @author Megha Agarwal
 *
 */
public class Factorial {
	/**
	 * 
	 * @param num
	 * @return
	 * get an integer value as parameter and return factorial of the given number
	 */
	public int getFactorial(int num)
	{
		int fact=1,i;
		while(num>1)									//calculating factorial using while loop
		{
			fact*=num;
			num-=1;
		}
		
		//for(i=2;i<num;i++)					//calculating factorial using for loop
		//	fact*=i;
		
		
		return fact;
	}
	public static void main(String[] args)
	{
		Factorial f=new Factorial();
		System.out.println("Factorial= "+f.getFactorial(6));
		
	}

}
