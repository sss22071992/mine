package com.gc.demo;

public class StringImmutable {

	public static void main(String[] args) {

		String s = new String("SATHISH");

		System.out.println(s);

		String s1 = s.concat("SUBRAMANIAN");
		
		System.out.println(s);

		System.out.println(s1);

		System.out.println("-------------------------------------");

		StringBuffer sb = new StringBuffer("SATHISH");

		System.out.println(sb);

		sb.append(" SUBRAMANIAN");

		System.out.println(sb);

	}
}
