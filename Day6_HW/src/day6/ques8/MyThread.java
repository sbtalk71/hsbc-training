package day6.ques8;

public class MyThread extends Thread {
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(i+ " This is Thread class demo");
		}
	}
}
