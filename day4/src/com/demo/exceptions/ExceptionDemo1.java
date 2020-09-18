package com.demo.exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		System.out.println(" Start of Program..");
		try {
			int a = 10;
			int b = 10;
			double d = a / b;
			int[] nums={1,2,3,4};
			System.out.println(nums[2]);
			
			String[] names=new String[5];
			//names[2].length();
			//throw new RuntimeException();
			System.out.println("No Exception in try block..");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			//e.printStackTrace();
			System.out.println("Exception Caught "+e);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Exception Caught "+e);
		}finally {
			System.out.println("this is finally block");
		}
		System.out.println(" End of Program..");
	}

}
