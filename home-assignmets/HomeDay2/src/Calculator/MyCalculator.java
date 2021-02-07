package Calculator;

/**
 * 
 * @author Megha Agarwal
 * add and multiply have array as parameters to pass 2-6 values
 *subtract and division have two parameters
 *
 */

public class MyCalculator {
	
	public int add(int[] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
			sum+=num[i];
		return sum;
	}
	
	public int subtract(int num1,int num2)
	{
		return num1-num2;
	}
	
	public int multiply(double num1,double num2)
	{
	return (int)(num1*num2);
	}
	
	public int divide(int num1,int num2)
	{
		return num1/num2;
		
	}
	
	/*public static void main(String args[])
	{
		int[] marks= {30,50,70};
		MyCalculator cal=new MyCalculator();
		System.out.println(cal.add(marks));
	}*/

}
