package day6.ques3;

public class Main {

	public static void start(MyRunnable obj) {
		obj.run();
	}

	public static void main(String[] args) {
		MyRunnable obj = new MyRunnable();
		start(obj);

	}

}
