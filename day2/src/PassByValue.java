
public class PassByValue {
	int x = 20;
	String[] names= {"scott","Tiger","James","Sharon"};
	public void display() {
		int y=x;
		System.out.println("The Value ="+y);
	}
	
	
	public static void main(String[] args) {
		
		PassByValue p=new PassByValue();
		
		
		
		p.display();
		System.out.println(p.x);
		
		for(int i=0;i<p.names.length;i++) {
		System.out.println(p.names[i]);
		}
		
		String[] names2=p.names;
		

		for(int i=0;i<names2.length;i++) {
		System.out.println(p.names[i]);
		}
		
		System.out.println(p.names==names2);
	}
}
