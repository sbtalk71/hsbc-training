/**
 * Grads_Day1
 * 
 * @author Devyansh Ojha
 */

package proj;
public class Prog {

	public static void main(String[] args) {

		System.out.println("Finding Factorial of 6");
		int f = 1;
		for (int i = 1; i <= 6; i++) {
			f = f * i;
		}
		System.out.println("Factorial of 6 is : " + f);

		System.out.println("Storing 10 names");
        
		String[] names= {"Ram", "Shaam", "Soy", "Dev","Ram", "Shaam", "Soy", "Dev","Soy", "Dev"};
		
		for (int i = 0; i <10; i++) {
		System.out.print(names[i]+" ");
		}
		
	}

}
