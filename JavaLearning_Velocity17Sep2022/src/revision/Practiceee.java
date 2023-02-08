package revision;

public class Practiceee {


	public void m1() {    // no return no argument
		System.out.println("no return no argument");
	}
	
	public int m1(boolean a) { // with return with argument
		System.out.println("with return with argument");
		return 50;
	}
	
	public boolean m2() {   //with return no argument
		System.out.println("with return no argument");
		return true; 
	}
	
	public void m3(int a, int b) {  // without return with argument 
		System.out.println("without return with argument");
	}
	
	
	
	public static void main(String[] args) {
		Practiceee ob = new Practiceee();
		ob.m1();
		ob.m1(true);
		ob.m2();
		ob.m3(55, 100);
		int c = ob.m1(true)+50;
		System.out.println(ob.m2()); // 
		System.out.println(c);
	}
}
