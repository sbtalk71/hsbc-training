
public class Cpu {
	double frequency;
	String core;
	
	Cpu(double frequency, String core)
	{
		this.frequency=frequency;
		this.core=core;
	}
	
	public String Specifications() {
		return frequency+" Ghz \n Core  "+core;
	}
}
