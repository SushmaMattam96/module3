package com.cg.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\spavanku\\Desktop\\FILE.txt");
		FileInputStream stream = null;

		try {
			stream = new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}

	}

}
