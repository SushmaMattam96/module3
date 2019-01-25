package com.cg.file.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		Employee employee = new Employee();

		File file = new File("C:\\Users\\spavanku\\Desktop\\objectWrite.txt");
		FileOutputStream outputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			outputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(outputStream);

			objectOutputStream.writeObject(employee);
			System.out.println("done..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
