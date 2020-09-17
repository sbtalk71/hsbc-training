package day2.classassignment;

public class Box {

	private double length;
	private double breadth;
	private double height;
	private String color = "Color not set";
	private double weight;

	public Box() {
		length = 0;
		breadth = 0;
		height = 0;
	}

	public Box(double l, double b, double h) {
		this.length = l;
		this.breadth = b;
		this.height = h;
	}

	public Box(double l, double b, double h, String c) {
//	 this.length=l;
//	 this.breadth=b;
//	 this.height=h;
		this(l, b, h);// must be the first call
		this.color = c;
	}

	public Box(double l, double b, double h, String c, double w) {
		this(l, b, h, c);// must be the first call
		this.weight = w;
	}

	public double getVolume() {
		return (length * breadth * height);
	}

	public String getColor() {
		return this.color;
	}

	public double getWeight() {
		return this.weight;
	}

}
