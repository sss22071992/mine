package com.gc.demo;

public class StingEx3 {

	public static void main(String[] args) {

		String s1 = new String("You Cannot Change Me!");
		String s2 = new String("You Cannot Change Me!");

		System.out.println("s1==s2----->" + (s1 == s2));
		System.out.println("s1.equals(s2)----->" + (s1.equals(s2)));

		String s3 = "You Cannot Change Me!";
		String s4 = "You Cannot Change Me!";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		System.out.println("s1==s4----->" + (s1 == s4));

		System.out.println("s3 intern" + s3.intern());
		System.out.println("s4 intern" + s4.intern());

		System.out.println("s1==s3----->" + (s1 == s3));

		String s5 = "You Cannot " + "Change Me!";
		System.out.println("s3==s5----->" + (s3 == s5));

	}
}
