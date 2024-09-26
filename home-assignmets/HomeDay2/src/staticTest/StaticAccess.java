package staticTest;

/**
 * 
 * @author Megha Agarwal
 * Trying to access static variable from ordinary methods
 *
 */

public class StaticAccess {

	static int count=5;
	
	public StaticAccess()
	{
		count++;
	}
	
	public void getCount()
	{
		//System.out.println("count= "+StaticAccess.count);
		//System.out.println("count= "+this.count);
		System.out.println("count= "+this.count);
		
		//able to get result from all the three syntaxes
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticAccess sa=new StaticAccess();
		StaticAccess sa2=new StaticAccess();
		StaticAccess sa3=new StaticAccess();
		StaticAccess sa4=new StaticAccess();
		sa4.getCount();

	}

}
