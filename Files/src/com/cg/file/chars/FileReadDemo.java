package com.cg.file.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {

		File file = null;
		StringBuilder builder = new StringBuilder();
		int read = 0;
		file = new File("C:\\Users\\spavanku\\Desktop\\SQLconcepts.txt");

		try (FileReader reader = new FileReader(file)) {
			while ((read = reader.read()) != -1) {
				builder.append((char)read);
			}
			System.out.println(builder);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
