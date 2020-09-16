/**
 *

 * @author Muskan Karnani
 *
 */
public class BiggestNumber 
{
	public static void main(String[] args)
	{
		int a=13,b=7,c=12;
		//Using ternary operator to find the biggest among three numbers
		int big=(a>b)?((a>c)?a:c):b;
		System.out.println("Biggest number among "+a+" "+b+" "+c+" is "+big);
	}

}
