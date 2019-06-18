package com.gc.demo;

public class StringIntern {

	public static void main(String[] args) {

		String s1 = new String("Durga");

		String s2 = s1.intern();

		System.out.println(s1 == s2);
		
		
		
		
		String s = "Happy";
		
		System.out.println(s.substring(2, 4));
		
		System.out.println(s.length());

	}
}
