/**
 * 
 * @author Muskan Karnani
 *
 */
public class Factorial {
	/**
	 * using for loop only
	 * @param n number whose factorial needs to be calculated 
	 * @return the factorial of the number passed
	 */
	public int usingForLoop(int n)
	{
		int f=1;
		for(int i=2;i<=n;i++)
			f*=i;
		return f;
	}
	/**
	 * using while loop only
	 * @param n number whose factorial needs to be calculated 
	 * @return the factorial of the number passed
	 */
	public int usingWhileLoop(int n)
	{
		int f=1;
		while(n>1)
		{
			f*=n;
			n--;
		}
		return f;
	}
	public static void main(String[] args)
	{
		Factorial f=new Factorial();
		System.out.println("Factorial of 6 using for loop is "+f.usingForLoop(6));
		System.out.println("Factorial of 6 using while loop is "+f.usingWhileLoop(6));

	}

}
