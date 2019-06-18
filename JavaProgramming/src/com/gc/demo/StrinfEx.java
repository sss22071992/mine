package com.gc.demo;

public class StrinfEx {

	public static void main(String[] args) {
		String s1 = "Spring";
		System.out.println("S1--"+s1);
		
		String s2 = s1 + "Summer";
		System.out.println("S2--"+s2);
		
		s1.concat("falls");
		System.out.println("S1--"+s1);
		
		s2.concat(s1);
		System.out.println("S2--"+s2);

		s1 += "winter";

		System.out.println("S1--"+s1);
		//System.out.println(s2);
	}

}
