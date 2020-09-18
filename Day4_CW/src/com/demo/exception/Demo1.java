package com.demo.exception;

public class Demo1 {

	static int[] nums = { 1, 7, 3, 4 };

	public static void main(String[] args) {
		// Demo1 d =new Demo1();
		String[] names=new String[5];
		//names[2]="Tom";
		

		try {

			System.out.println(nums[2]);
			System.out.println(names[2]);
			//System.out.println(names[5]);
			System.out.println(names[2].length());
			
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("not accessible");
		}
		catch(NullPointerException e) {
			System.out.println("empty location");
		}
	}

}
