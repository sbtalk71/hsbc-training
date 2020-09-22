
package day6HomeAssignment;

public class ThreadRun implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is :" + Thread.currentThread().getName() + " " + i);

		}
	}
}
