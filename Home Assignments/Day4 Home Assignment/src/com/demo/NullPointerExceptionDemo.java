/**
 * 
 * @author Muskan Karnani
 *
 */
package com.demo;

public class NullPointerExceptionDemo {
	private String name;

    public NullPointerExceptionDemo(String name) {
    	this.name = name;
    }

    public NullPointerExceptionDemo() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
    	System.out.println(name + " (" + name.length() + ")");
    }

    public static void main(String[] args)throws MyNullPointerException {
        NullPointerExceptionDemo p = new NullPointerExceptionDemo();
        try{
        	p.print();
        }catch(MyNullPointerException e)
        {
        	//System.out.println(e);
        	throw new MyNullPointerException("Null Pointer Exception it is!!!");
        }
    }

}
