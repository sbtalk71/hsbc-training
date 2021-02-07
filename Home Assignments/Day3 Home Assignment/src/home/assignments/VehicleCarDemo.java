package home.assignments;

//driver class 
public class VehicleCarDemo {

	 public static void main(String args[])  
	 { 
	     // using superclass reference 
	     // first approach 
	     Vehicle vh2 = new Car(4, 200, "Black"); 
	       
	     // using subclass reference( ) 
	     // second approach 
	     Car c1 = new Car(3, 100, "Red"); 
	       
	     System.out.println("Color of first Car is "+ c1.color); 
	           
	     // In case of overridden methods always subclass method will be executed 
	     System.out.println(c1.toString()); 
	     System.out.println(vh2.toString()); 

	     /* The following statement is invalid because Vehicle does not define a color.  
	     // System.out.println("Color of second vehicle is "+ vh2.color); */
	                   
	     /* The following statement is invalid because Vehicle does not define setColor() method.  
	     vh2.setColor("Blue");*/

	 }  
}
