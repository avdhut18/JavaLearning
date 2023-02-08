package practiceprogram;

public class Practiceee {

	
	int a;
	int b;
	int c;
	
	public void m1(int a,int b, int c) {
		this.a=a;
		System.out.println(a+b+c); 
	}
	
	public void m2() {
	
		m1(10,55,20);
		System.out.println("con 2");
	}
	
	
	public static void main(String[] args) {
		Practiceee ob = new Practiceee();
		ob.m2();
		System.out.println(ob.a); // 0
		
		// to initialize data member and execute business logic at the time of OBJECT CREATION
	}
}
