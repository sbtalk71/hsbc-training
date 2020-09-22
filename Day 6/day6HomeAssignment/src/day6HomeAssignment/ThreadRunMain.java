package day6HomeAssignment;

public class ThreadRunMain {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new ThreadRun());
		Thread t2 = new Thread(new ThreadRun());
		Thread t3 = new Thread(new ThreadRun());

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("Completed thread");
	}
}
