package accessmodifer;

  public class Test1 {

	 protected int a = 200;
	 
	public void m1() {
		System.out.println("m1 from parent ");
	}
	
	public void m2() {
		System.out.println("m2");
	}
	
	public static void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.a);
		t1.a=100;
		System.out.println(t1.a); // 100
	}
}
