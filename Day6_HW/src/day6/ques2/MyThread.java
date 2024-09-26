package day6.ques2;

public class MyThread implements Runnable {
	
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println(i+ " This is Thread class demo");
	}
}
