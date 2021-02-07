package day6.ques1;

public class MyThread extends Thread {
	
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println(i+ " This is Thread class demo");
	}
}
