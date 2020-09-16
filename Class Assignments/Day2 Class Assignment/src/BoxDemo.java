public class BoxDemo
{
	public static void main(String[] args)
	{
		Box box1=new Box(10,20,30);
		System.out.println("The volume of box is "+ box1.getVolume());
		System.out.println("The color of box is "+ box1.getColor());
		System.out.println("The color of box is "+ box1.getWeight());
		System.out.println();
		Box box2=new Box(10,20,30, "Blue");
		System.out.println("The volume of box is "+ box2.getVolume());
		System.out.println("The color of box is "+ box2.getColor());
		System.out.println("The color of box is "+ box2.getWeight());
		System.out.println();
		Box box3=new Box(10,20,30, "Blue",9.6);
		System.out.println("The volume of box is "+ box3.getVolume());
		System.out.println("The color of box is "+ box3.getColor());
		System.out.println("The color of box is "+ box3.getWeight());
		System.out.println();
		Box cube=new Box(10);
		System.out.println("The volume of cube is "+ cube.getVolume());
	}
}
