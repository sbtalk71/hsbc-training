/**
 * 
 * @author Muskan Karnani
 * this is to observe that if Inf2 extends Inf1 then how the classes Demo1 and Demo2 will act if it implements Inf2 interface
 *
 */
package home.assignments;
public class DemoDemo {
	 public static void main(String args[]){
			Inf2 obj = new Demo1();
			obj.method1();
			obj.method2();
			Inf2 obj1 = new Demo2();
			obj1.method1();
			obj1.method2();
			    }

}
