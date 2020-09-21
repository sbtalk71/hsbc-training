import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {
	public static void main(String[] args) throws IOException {
		File file = new File("f:\\dev.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		try {
			BufferedReader reader = new BufferedReader(input);
			String line;

			int countWord = 0;
			int sentenceCount = 0;

			while ((line = reader.readLine()) != null) {

				String[] wordList = line.split("\\s+");

				countWord += wordList.length;

				String[] sentenceList = line.split("[!?.:]+");

				sentenceCount += sentenceList.length;

			}

			System.out.println("Total word count = " + countWord);
			System.out.println("Total number of sentences = " + sentenceCount);
			reader.close();
		} catch (EOFException e) {
			System.out.println(e);
		}

	}

}
