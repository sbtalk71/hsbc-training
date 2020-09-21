import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyEmpSerializer {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fos);

		for (int i = 0; i < 10; i++) {
			Emp emp = new Emp(100 + i, "dev" + i, "London" + i, 65000 + i);
			objOut.writeObject(emp);
		}
		// Emp emp = new Emp(100, "dev", "London", 65000);

		objOut.close();
		System.out.println("Emp Serialized");
	}
}
