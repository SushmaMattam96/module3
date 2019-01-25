package com.cg.exceptions;

import java.sql.SQLException;

public class ThrowsDemo {

	public void execute() throws InterruptedException, ClassNotFoundException, SQLException {
		Thread.sleep(1000);
	}

	public static void main(String[] args) {

		ThrowsDemo demo = new ThrowsDemo();
		try {
			demo.execute();
		} catch (InterruptedException e) {
			System.out.println(e.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
