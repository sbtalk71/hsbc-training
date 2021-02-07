
public class CodeOfCity 
{
	public String getCityByCode(int code)
	{
		if(code==1)
		 return "DELHI";
		
		if(code==2)		
		return "NOIDA";
		
		if(code==3)
		return "GURGAON";
		
		if(code==4)
		return "BANGALORE";
		
		return "INVALID CODE";
	}
	public static void main(String[] args) {
		CodeOfCity ob=new CodeOfCity();
		
		System.out.println("The city for code 1 is "+ob.getCityByCode(1));

		
		System.out.println("The city for code 2 is "+ob.getCityByCode(2));

		
		System.out.println("The city for code 3 is "+ob.getCityByCode(3));
		

		System.out.println("The city for code 4 is "+ob.getCityByCode(4));

		System.out.println("The city for code 5 is "+ob.getCityByCode(5));
	}
	
}
