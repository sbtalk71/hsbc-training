
public class Static {
	
	 static  double pi= 3.17 ,vol,a=10;
	 int r,h;
	 double volume;
	 
	 
	 public static double cylinder(int r, int h)
	 {
		 vol= pi*r*r*h;
		 return vol;
	 }
	 
	 public  double sphere(int r)
	 {
		 volume= 1.3*pi*r*r*r;
		 return volume;
	 }

	 public  double cube()
	 {
		 volume= a*a*a;
		 return volume;
	 }


	public static void main(String[] args) {
		System.out.println("value of pi=" +pi);
		//System.out.println("value of volume=" +volume);
		//(cannot access as object is required to access a non static variable )
		Static s = new Static();
		System.out.println(cylinder(5, 10));
		System.out.println(s.sphere(1));
	}

}
/*Using the ordinary methods try to access static variables and test what happens.

It will raise an error stating a static variable cannot be assigned
 to a non-static method, it will require an instance to class to access it */
