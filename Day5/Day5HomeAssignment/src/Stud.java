import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Stud {
	public static void main(String[] args) {
		FileReader fr = null;

		BufferedReader br = null;
		try {
			fr = new FileReader("d:\\temp\\io\\emp.txt");
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] cols = line.split(",");
				int id = Integer.parseInt(cols[0]);
				StudDB e = new StudDB(id, cols[1], cols[2]);

				System.out.println(e.getStudId() + " " + e.getName());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (EOFException e) {
			System.out.println("done reading...");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
