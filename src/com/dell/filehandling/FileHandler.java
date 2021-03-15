package com.dell.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

	public String readFile() {
		StringBuilder sb = new StringBuilder();
		System.out.println("Starting read file");
		try {
			FileReader reader = new FileReader("C:\\Users\\luis_alimari\\Desktop\\test.txt");
			int character;

			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
				sb.append((char) character);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

	public void writeFile() {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\luis_alimari\\Desktop\\test.txt", true);
			writer.write("Hello World! ");
			writer.close();
			System.out.println("File write sucessfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
