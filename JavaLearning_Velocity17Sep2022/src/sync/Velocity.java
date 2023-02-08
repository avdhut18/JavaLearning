package sync;

public class Velocity {

	public void automation(String faculty) {
		for (int i = 0; i < 10; i++) {
			System.out.println("JAVA: " + faculty);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("handled");
			}

		}
	}
}
