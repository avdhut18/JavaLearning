package variable;

public class VariableTypes {


	static int a = 20; 
	
	public void m1() {
		int a = 55; 
		System.out.println(VariableTypes.a); // 20 
	System.out.println(a);  // 55
	}
	
	public static void main(String[] args) {
		VariableTypes on = new VariableTypes();
		on.m1();
		System.out.println(a);  // 20
	}

}

