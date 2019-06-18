package com.gc.demo;

public class GcDemo1 {

	static GcDemo1 s;

	public static void main(String[] args) throws Exception {

		GcDemo1 f = new GcDemo1();
		System.out.println(f.hashCode());

		f = null;
		System.gc();
		Thread.sleep(5000);

		System.out.println(s.hashCode());

	}

}
