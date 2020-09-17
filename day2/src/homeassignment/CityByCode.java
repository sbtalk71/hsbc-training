package homeassignment;

public class CityByCode {

	public String getCityByCode(int code) {

		if (code == 1)
			return "DELHI";
		else if (code == 2)
			return "NOIDA";
		else if (code == 3)
			return "GUARGAON";
		else if (code == 4)
			return "BANGLORE";
		else
			return "INVALIDCODE";

	}

	public static void main(String[] args) {
		int c = 3;
		CityByCode ob = new CityByCode();
		System.out.println(ob.getCityByCode(c));
	}
}
