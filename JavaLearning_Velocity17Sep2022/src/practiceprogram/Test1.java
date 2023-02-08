package practiceprogram;

public interface Test1 {

	
	private void m1() {
		System.out.println("m1 private");
	}
	
	default void m2() {
		m1();
	}
}
