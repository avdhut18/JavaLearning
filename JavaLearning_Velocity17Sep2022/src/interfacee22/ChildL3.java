package interfacee22;

public class ChildL3 implements L1,L2 {

	@Override
	public int test1() {
		// TODO Auto-generated method stub
		return 55;
	}

	@Override
	public boolean test2() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		ChildL3 ob = new ChildL3();
		int c = ob.test1();
		System.out.println(c); //55
		boolean n = ob.test2();
		System.out.println(n); //false
		
		
	}
}
