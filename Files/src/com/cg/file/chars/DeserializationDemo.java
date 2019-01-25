package com.cg.file.chars;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\spavanku\\Desktop\\objectWrite.txt");
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Employee employee = null;

		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);

			employee = (Employee) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(employee.id + employee.name + employee.salary);
		
		employee.test();

	}

}
