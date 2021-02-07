
public class MyCalculator {
	int a,b,c,d;
	static int sum,sub,mul,div;
	
	public static int  Add(int a, int b, int c,int d)
	{
		sum = a+b+c+d;
		return sum;
	}
	public static int  Substraction(int a, int b)
	{
		if(a>b)
			sub = a-b;
		else
			sub=b-a;
		return sub;
	}
	
	public static int  Multiply(int a, int b)
	{
		mul = a*b;
		return mul;
	}
	
	public static int  Divide(int a, int b)
	{
		div = a/b;
		return div;
	}
}
