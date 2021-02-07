package day6.ques5;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new JoinDemo();
		Thread t2 = new JoinDemo2();

		
		t1.start();
		t2.start();
		try {

			t1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		try {

			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
