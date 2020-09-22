package day6HomeAssignment;

public class MainThreadSleep {
	public static void main(String[] args) {
		ThreadSleep t1 = new ThreadSleep();
		ThreadSleep t2 = new ThreadSleep();

		t1.start();

		t2.start();

	}
}
