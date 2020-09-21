import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadArr {
	public static void main(String[] args) {
		FileReader fis = null;
		FileWriter fos = null;
		try {
			File file = new File("d:\\temp\\io\\demo.txt");
			fis = new FileReader(file);
			fos = new FileWriter("demo_1.txt", true);

			int data = 0;
			while ((data = fis.read()) != -1) {

				System.out.print((char) data);
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally..");
			try {
				if (fis != null || fos != null) {
					fis.close();
					fos.close();
				}
			} catch (IOException e) {
				System.out.println("Streams could not be closed : " + e);
			}

		}
		System.out.println("End of task..");
	}
}
