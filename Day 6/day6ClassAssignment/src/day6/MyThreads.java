package day6;

public class MyThreads extends Thread {
	@Override
	public void run() {

		try {
			for (int i = 0; i < 2; i++) {
				System.out.println("interation no : " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
