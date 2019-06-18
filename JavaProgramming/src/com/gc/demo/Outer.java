package com.gc.demo;

public class Outer {

	public static void main(String[] args) {

		Outer o = new Outer();
		Innner i = new Outer().new Innner();
		i.methodone();

	}

	class Innner {
		public void methodone() {
			System.out.println("This is innerkwwie method");
		}
	}

}
