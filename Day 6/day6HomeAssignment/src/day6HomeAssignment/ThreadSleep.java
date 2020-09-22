package day6HomeAssignment;

public class ThreadSleep extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(50000);
			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}
