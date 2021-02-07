/**
 * This iss to check if we can access member variables and member fuctions of a class from different package.
 *  we can only access if they are public and importing the class is also necessary
 */
package org.demo.clients;
import org.demo.tools.Calculator;

public class MathTester {
	public static void main(String[] args) {
		Calculator c=new Calculator(2.5,6.9);
		c.add();
		c.subtract();
		c.multiply();
		
	}
	}
