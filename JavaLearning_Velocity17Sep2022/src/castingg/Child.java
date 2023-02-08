package castingg;

public class Child extends Parent {

	void m3() {
		System.out.println("m3 child");
	}
	
	public static void main(String[] args) {

		Parent pRef= new Child();
		Child cRef = (Child)pRef;
		
		cRef.m1();
		cRef.m2();
		cRef.m3();
	}
}
