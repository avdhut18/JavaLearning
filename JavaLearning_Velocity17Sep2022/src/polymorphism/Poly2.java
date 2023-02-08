package polymorphism;

public class Poly2 extends Poly1 {

	public static void m1() {

		System.out.println("m1 is in child");
	}

	public static void main(String[] args) {

		Poly1 ref = new Poly2();

	}

}
