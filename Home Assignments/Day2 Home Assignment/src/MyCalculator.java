
public class MyCalculator {
	public double a,b,c,d,e,f;
	public double add(double a, double b)
	{
		return (a+b);
	}
	public double add(double a, double b, double c)
	{
		return (a+b+c);
	}
	public double add(double a, double b,double c, double d)
	{
		return (a+b+c+d);
	}
	public double add(double a,double b,double c, double d, double e)
	{
		return (a+b+c+d+e);
	}
	public double add(double a, double b,double c, double d, double e,double f)
	{
		return (a+b+c+d+e+f);
	}
	
	public double sub(double a, double b)
	{
		return (a-b);
	}
	public double mult(double a, double b)
	{
		return (a*b);
	}
	public double mult(double a, double b, double c)
	{
		return (a*b*c);
	}
	public double mult(double a, double b,double c, double d)
	{
		return (a*b*c*d);
	}
	public double mult(double a,double b,double c, double d, double e)
	{
		return (a*b*c*d*e);
	}
	public double mult(double a, double b,double c, double d, double e,double f)
	{
		return (a*b*c*d*e*f);
	}
	public double divide(double a, double b)
	{
		return (a/b);
	}
	public static void main(String[] args) {
		MyCalculator ob=new MyCalculator();
		System.out.println(ob.add(2.5, 3.6));
		System.out.println(ob.add(3.2, 6.9, 75.3));
		System.out.println(ob.add(2.5, 56.5, 15.6, 5.5));
		System.out.println(ob.add(2.3, 2.6, 5.9, 6.8, 6.5));
		System.out.println(ob.add(2.6, 6.5, 9.2, 9.64, .29, .49));
		System.out.println(ob.sub(1865, 566));
		System.out.println(ob.divide(25,5));
		System.out.println(ob.mult(2.5, 3.6));
		System.out.println(ob.mult(3.2, 6.9, 75.3));
		System.out.println(ob.mult(2.5, 56.5, 15.6, 5.5));
		System.out.println(ob.mult(2.3, 2.6, 5.9, 6.8, 6.5));
		System.out.println(ob.mult(2.6, 6.5, 9.2, 9.64, .29, .49));
		
	}
	
}
