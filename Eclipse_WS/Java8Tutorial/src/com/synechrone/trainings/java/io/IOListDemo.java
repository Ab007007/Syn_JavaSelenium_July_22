package com.synechrone.trainings.java.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class IOListDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Synechron_04_07_Selenium\\Eclipse_WS\\Java8Tutorial");
		Stream<Path> files = Files.list(f.toPath());
		files.forEach(System.out :: println);
		
		System.out.println("Walk output");
		Stream<Path> allFiles = Files.walk(f.toPath());
		allFiles.forEach(System.out :: println);
		
		System.out.println("Lines");
		File f1 = new File("D:\\Synechron_04_07_Selenium\\Eclipse_WS\\Java8Tutorial\\src\\com\\synechrone\\trainings\\java\\streams\\StreamUsingMap.java");
		Stream<String> fileContent = Files.lines(f1.toPath());
		fileContent.forEach(System.out :: println);
		
		
	}
}
