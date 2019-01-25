package com.cg.file.chars;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		File file = new File("C:\\\\Users\\\\spavanku\\\\Desktop\\\\SQLconcepts.txt");

		if (file.exists()) {
			System.out.println(" file present..");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
		} else {
			System.out.println("no file present..");

		}

	}

}
