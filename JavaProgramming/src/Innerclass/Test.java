package Innerclass;

public class Test {

	public static void main(String[] args) {

		Popcorn p = new Popcorn() {
			public void taste() {
				System.out.println("salty");
			}
		};
		p.taste();
		Popcorn p1 = new Popcorn();
		p1.taste();
	}
}
