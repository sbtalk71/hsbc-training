
public class Computer {

	public static void main(String[] args) {
		//Computer c = new Computer();
		Monitor m=new Monitor(59,"Lenovo");
		Keyboard k =new Keyboard("Querty");
		Cpu cp =new Cpu(4.0 ,"intel");
		m.Company();
		k.Keytype();
		cp.Specifications();
		System.out.println("Monitor "+m.Company()+"\nKeyboard"+
		k.Keytype()+"\n Cpu  "+
		cp.Specifications());

	}

}
