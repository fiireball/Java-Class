package a16.lambdas;

public class Main {
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}).start();
	}
}

