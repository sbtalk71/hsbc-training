package com.demo.test.others;

public class Test {
	class Inner1{
		public void display()
		{
			System.out.println(": from inner1 display mmethod");
		}
	}
		static class Inner2{
			public void fun()
			{
				System.out.println("from notFun()");
			}
		}
	

	public static void main(String[] args) {

	}

}
interface Fun{
	public void notFun();
}