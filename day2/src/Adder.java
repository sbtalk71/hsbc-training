
public class Adder {

	public static void main(String[] args) {
		int sum=0;
		if(args.length<2) {
			System.out.println("Please input min of 2 numbers");
		}else {
			for (int i = 0; i < args.length; i++) {
				int x=Integer.parseInt(args[i]);
				sum=sum+x;
			}
		}
		if(sum!=0) {
		System.out.println("Sum = "+sum);
		}
	}

}
