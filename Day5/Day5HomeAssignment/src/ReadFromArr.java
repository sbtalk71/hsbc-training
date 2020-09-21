import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromArr {
	public static void main(String[] args) {
		String mycontent = "";
		BufferedWriter bw = null;
		try {
			String[] cars = { "A", "B", "C", "D", "E", "A", "B", "C", "D", "E", "A", "B", "C", "D", "E" };
			for (int i = 0; i < 5; i++) {
				mycontent = mycontent + cars[i] + "\n";
			}

			File file = new File("myfile.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
			System.out.println("File written Successfully");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}
}
