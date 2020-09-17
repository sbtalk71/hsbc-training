
public class City {
	
	int number;
	public String getCityByCode(int number) {
		if(number==1)
		return "delhi";
		
		else if(number==2)
		return "NOIDA";
		
		else if(number==3)
			return "GUARGAON";
		
		else if(number==4)
			return "BANGLORE";
		
		else 
			return "INVALIDCODE";
		
		
	}
	
	public static void main(String[] args)
	{
		City c = new City();
		System.out.println(c.getCityByCode(4));
	}

}
