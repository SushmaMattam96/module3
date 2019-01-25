package com.cg.file.chars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) {

		File file = null;
		StringBuilder builder = new StringBuilder();
		String line = "";

		file = new File("C:\\Users\\spavanku\\Desktop\\SQLconcepts.txt");

		try (FileReader reader = new FileReader(file); 
				BufferedReader bufferedReader = new BufferedReader(reader)) {

			while ((line = bufferedReader.readLine()) != null) {
				builder.append(line);
				builder.append("\r\n");
			}

			System.out.println(builder);

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
