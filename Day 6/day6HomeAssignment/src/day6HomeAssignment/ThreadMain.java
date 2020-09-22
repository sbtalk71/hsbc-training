package day6HomeAssignment;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Starts");
		MyThreads t1 = new MyThreads();
		MyThreads t2 = new MyThreads();
		MyThreads t3 = new MyThreads();

		t1.start();
		t2.start();
		t3.start();

		System.out.println(t1);
		System.out.println(Thread.currentThread());

		t1.join();
		t2.join();
		t3.join();

		System.out.println("Main Thread Exits");
	}

}
