package argumentsandreturntype;

public class WithArgAndNoReturn {

	public void m1(int a) {
		System.out.println(a);
	}
	
	public static void m2(boolean c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		WithArgAndNoReturn ob = new WithArgAndNoReturn();
		ob.m1(100);
		
		m2(false);
		
	}
}
