package day6;

public class Worker implements Runnable {

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
