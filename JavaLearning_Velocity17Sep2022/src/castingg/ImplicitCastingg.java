package castingg;

public class ImplicitCastingg {

	public static void main(String[] args) {
		byte a = 100;
		short b = a;
		int c = b;
		long d = c;
		double e = d;
		System.out.println(e); // 100.00
	}
}
