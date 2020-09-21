import java.io.FileWriter;
import java.io.IOException;

public class ReadFlush {
	public static void main(String[] args) throws IOException {
		String lines[] = new String[20];

		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				lines[i] = "line no" + i;
			}
		}

		FileWriter fw = new FileWriter("demo2.txt");
		int i = 0;
		while (i < 20) {
			if (lines[i] != null) {
				fw.write(lines[i] + "\n");
			}
			i++;
		}
		fw.flush();
	}

}
