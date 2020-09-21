import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileone {
	public static void main(String args[]) throws FileNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("f:\\data.txt");

		FileOutputStream fos = new FileOutputStream("f:\\field.txt");

		int b;
		while ((b = fis.read()) != -1)
			fos.write(b);

		fis.close();
		fos.close();

	}
}
