
public class overloading {
	int a,b,d;
	double sum,c;
	overloading(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		//System.out.println(sum=a+b);
	}
	
	
	overloading(int a,int b,int d)
	{
		this(a, b);
		this.d=d;
		sum=a+b+d;
		System.out.println(sum);
	}
	
	
	overloading(int a,int b,double c)
	{
		this(a, b);
		this.c=c;
		sum=a+b+c;
		System.out.println(sum);
	}
	
}
