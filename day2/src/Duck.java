
public class Duck {

	static {
		System.out.println("This is from static block");
	}

	static int duckCount = 0;

	public Duck() {

		System.out.println("Duck Created...");
		duckCount++;
	}

	public static String getDuckBreed() {
		
		return "Marsh Duck";
	}

}
