package day6;

public class ThreadImpl {
	public static void main(String[] args) throws InterruptedException {
		MessagePrinter printer = new MessagePrinter();
		Thread t1 = new Thread(new PrintWorker(printer, "hello"));
		Thread t2 = new Thread(new PrintWorker(printer, "Good"));
		Thread t3 = new Thread(new PrintWorker(printer, "world"));

		t1.start();
		t2.start();
		t3.start();
 
		t1.join();
		t2.join();
		t3.join();

	}
}
