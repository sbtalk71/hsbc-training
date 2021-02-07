
public class Hello {
	//hello(int i), hello(byte i) hello(short i), hello(long i)
	Hello(int i){
		System.out.println("integer");	
	}
	
	Hello(byte i){
		System.out.println("byte");	
	}
	
	Hello(short i){
		System.out.println("short");	
	}
	
	Hello(long i){
		System.out.println("long");	
	}
	
	
	public static void main(String[] args)
	{
		Hello h = new Hello(5);
	}
}
/* the output is integer since 5 is a numeric value it falls under integer 
and finds the constructor that matches its type.
IF integer was absent, it would go for long .
otherwise it throws an error that constructor isn't defined.*/
