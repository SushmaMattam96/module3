package com.cg.exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		/*String str = "java";
		System.out.println(str.charAt(56));
		 */
	}

}
