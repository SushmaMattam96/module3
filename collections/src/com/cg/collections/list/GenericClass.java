package com.cg.collections.list;

public class GenericClass<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {

		GenericClass<String> genericClass1 = new GenericClass<>();
		genericClass1.setT("aaa");
		System.out.println(genericClass1.getT());

		GenericClass<Integer> genericClass2 = new GenericClass<>();
		genericClass2.setT(123);
		System.out.println(genericClass2.getT());

	}

}
