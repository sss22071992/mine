package com.gc.demo;

public class StingEx2 {

	public static void main(String[] args) {

		String s1 = new String("durga");
		System.out.println("s1    " + s1);

		String s2 = s1.concat("software");
		System.out.println("s2    " + s2);

		String s3 = s2.intern();
		System.out.println("s3    " + s3);

		String s4 = "durgasoftware";
		System.out.println("s4    " + s4);

		System.out.println(s3 == s4);

	}
}
