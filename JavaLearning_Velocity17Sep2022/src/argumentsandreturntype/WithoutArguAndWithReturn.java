package argumentsandreturntype;

public class WithoutArguAndWithReturn {

	public int m1() {
		return 55;
	}
	
	public static boolean m2() {
		return  true;
	}
	
	public static void main(String[] args) {
		WithoutArguAndWithReturn ob = new WithoutArguAndWithReturn();
		System.out.println(ob.m1()); // 55

		System.out.println(m2()); // true
	}
}
