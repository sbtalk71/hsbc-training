package day6;

public class ThreadMain2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Starts");
		Worker w1 = new Worker();
		Thread t1 = new Thread(w1);
		t1.start();
		t1.join();
		System.out.println("Main Thread Exits");
	}

}
