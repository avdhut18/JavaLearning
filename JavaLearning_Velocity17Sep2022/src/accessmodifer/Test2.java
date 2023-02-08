package accessmodifer;

public class Test2 extends Test1 {


	public void m1() {
		System.out.println("m1 child");
	}
	
	public static void main(String[] args) {
	
		Test2 ch = new Test2();
		ch.m1();  //
		System.out.println(ch.a);
		Test1 nn = new Test1();
		System.out.println(nn.a);
		
	}
	
}

