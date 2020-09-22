package day6.ques5;

public class JoinDemo extends Thread{
	
	public void run()
	{//printing 5 numbers
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);}
	}

}
