package Exp;

public class App1 {

	public void calculate(int a,int b)
	{
		App2 o=new App2(a,b);
		try {
			o.divide(a,b);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
				
	}
}
