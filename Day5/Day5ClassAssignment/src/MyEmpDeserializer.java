import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyEmpDeserializer {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream objIn = new ObjectInputStream(fis);
		try {
			while (true) {
				Object obj = objIn.readObject();
				Emp e = (Emp) obj;

				System.out.println(e.getEmpId() + " " + e.getName());
			}
		} catch (EOFException e) {
			System.out.println("Done reading");
		}

		objIn.close();
	}

}
