package com.demo.app2.entity;

public class AppExp {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		try {
			System.out.println(nums[4]);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

		try {
			String names[] = new String[5];
			names[2].length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("the is final");
		}

		System.out.println("End of Porogram");

	}
}
