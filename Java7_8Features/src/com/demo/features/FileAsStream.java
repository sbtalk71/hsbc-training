package com.demo.features;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileAsStream {

	public static void main(String[] args) throws Exception {
		Path filePath=Paths.get("app.txt");
		
		Stream<String> fileStream=Files.lines(filePath);
		
		fileStream.filter(s->s.contains("Hyderabad")).forEach(System.out::println);

	}

}
