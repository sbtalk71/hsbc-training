package package2;

import package1.A;

public class B {
public static void main(String[] args) {

	A ob=new A();
	//private cannot be accessed from different package
	//System.out.println(ob.x);
	//protected cannot be accessed from different package and can only be accessed if it is inheriting the other class from different package
	//System.out.println(ob.y);
	//public can only be accessed if we import the class
	System.out.println(ob.z);
	//default cannot be accessed from different package
	//System.out.println(ob.w);
}
}