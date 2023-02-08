package inheritancetypes;

public class Child1 extends Parent {
	
	static int a = 100;
	int b = 200;
	public void m2() {
		System.out.println("child1 method");
	}
	
	public void ch1Method() {
		System.out.println(a);//100 
		System.out.println(Parent.a); //20
	}

	public static void main(String[] args) {
		Child1 ch = new Child1();
		ch.m1();
		ch.ch1Method();
		
	}
}
