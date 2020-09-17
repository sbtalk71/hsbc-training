package homeassignment;

public class Demo4 {

	static int i=5;
	public int fun1()
	{
		i=+1;
		return i;
	}
	
	public static int fun2()
	{
		i=+1;
		return i;
	}

public static void main(String[] args) {
	Demo4 ob1=new Demo4();
	System.out.println(Demo4.i);
	System.out.println(ob1.fun1());
	System.out.println(fun2());
	
}	
}
