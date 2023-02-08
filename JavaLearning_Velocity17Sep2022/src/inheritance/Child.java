package inheritance;

public class Child extends Parent  { 

	public void m3() {
	System.out.println("Non static method of child class");	
	}
	
	
	public static void main(String[] args) {
//		Parent.m1();    /// Association // Aggragation // HAS-A reltion 
//		Parent ob = new Parent();
//		ob.m2();   /// Association // Aggragation // HAS-A reltion
//		
		Child ob1 = new Child();
		ob1.m3();

	}
}
