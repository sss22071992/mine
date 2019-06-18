package com.gc.demo;

public class Hashcode1 implements Cloneable {

	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		Hashcode1 h1 = new Hashcode1();
		// Hashcode1 h2 = h1;
		Hashcode1 h2 = (Hashcode1) h1.clone();

		h1.i = 888;
		h2.j = 999;

		System.out.println(h1 + "-----" + h2);
		System.out.println(h1.hashCode() + "----" + h2.hashCode());
		System.out.println(h1.i + "----" + h1.j);
		System.out.println(h2.i + "----" + h2.j);

		System.out.println(h1.hashCode() == h2.hashCode());
		System.out.println(h1 == h2);
	}

}
