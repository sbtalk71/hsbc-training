package day6HomeAssignment;

public class TestPriority extends Thread {
	public void run() {
		System.out.println("Run method");
	}

	public static void main(String[] args) {
		TestPriority t1 = new TestPriority();
		TestPriority t2 = new TestPriority();
		TestPriority t3 = new TestPriority();

		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t2 thread priority : " + t2.getPriority());
		System.out.println("t3 thread priority : " + t3.getPriority());

		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);

		System.out.println("t1 thread priority : " + t1.getPriority());
		System.out.println("t2 thread priority : " + t2.getPriority());
		System.out.println("t3 thread priority : " + t3.getPriority());

		System.out.print(Thread.currentThread().getName());
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
	}
}
