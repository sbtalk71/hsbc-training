/**
 * 
 * @author Megha agarwal
 *
 */
public class CityCode {
	/**
	 * 
	 * @param code
	 * use of switch case to return city names
	 */

	public String getCityByCode(int code)
	{
		switch(code)
		{
		case 1: return "Delhi";
		case 2: return "Noida";
		case 3 :return "Gurgaon";
		case 4: return "Bangalore";
		default:  return "Invalid City code";
		}
		
	}
	public static void main(String[] args)
	{
		CityCode c=new CityCode();
		System.out.println(c.getCityByCode(3));
	}
}
