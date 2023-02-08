package argumentsandreturntype;

public class WithoutArgAndWitoutReturn {

	//without argument and without return type
	public void m1() {
		System.out.println("without argument and without return type");
	
	}
	
	public static void m2() {
		System.out.println("without argument and without return type");
	}
	
	public static void main(String[] args) {
		WithoutArgAndWitoutReturn on = new WithoutArgAndWitoutReturn();
		on.m1();
		m2();
	}
	
}
