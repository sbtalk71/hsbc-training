
public class Box 
{
	//private member variables required
	private double length, breadth, height, weight;
	private String color="Color not set";
	//constructor if that box is a cuboid
	public Box(double length, double breadth, double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	//constructor overoading with code reusability
	public Box(double length, double breadth, double height, String color)
	{
		/*this.length=length;
		this.breadth=breadth;
		this.height=height;*/
		this(length, breadth, height);
		this.color=color;
	}
	//constructor overoading with code reusability
	public Box(double length, double breadth, double height, String color, double weight)
	{
		/*this.length=length;
		this.breadth=breadth;
		this.height=height;*/
		this(length, breadth, height, color);
		this.weight=weight;
	}
	//constructor if that box is a cube
	public Box(double length)
	{
		this(length,length,length);
	}
	//function to compute volume of a box
	public double getVolume()
	{
		return length*breadth*height;
	}
	//getter method for color
	public String getColor()
	{
		return color;
	}
	//getter method for weight
	public double getWeight()
	{
		return weight;
	}
}
