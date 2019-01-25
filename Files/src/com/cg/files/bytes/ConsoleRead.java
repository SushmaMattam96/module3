package com.cg.files.bytes;

import java.io.IOException;

class ConsoleRead {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		char ch;

		try {
			while ((ch = (char)System.in.read()) != '\n') {
				builder.append(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(builder);
	}
}
