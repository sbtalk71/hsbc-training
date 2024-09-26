package day6.ques1;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
