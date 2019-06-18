package Innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {

		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child");
				}
			}
		};

		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main");
		}

	}

}
[.]