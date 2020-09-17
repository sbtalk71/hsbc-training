
public class ChildInstance extends DemoInstanceOf {
	public static void main(String[] args) {
		ChildInstance ob = new ChildInstance();

		if (ob instanceof DemoInstanceOf) {
			System.out.println("InstanceOf");
		} else {
			System.out.println("Not InstanceOf");
		}
	}

}
