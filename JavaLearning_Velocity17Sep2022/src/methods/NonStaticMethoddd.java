package methods;

public class NonStaticMethoddd {

	public void demo() {
		System.out.println("demo is non-static method");
	}
	
	public static void main(String[] args) {
		NonStaticMethoddd jj = new NonStaticMethoddd();
		jj.demo();
		System.out.println(1+1);
		System.out.println(1+2);
		System.out.println(1+3);
		
	}
}
