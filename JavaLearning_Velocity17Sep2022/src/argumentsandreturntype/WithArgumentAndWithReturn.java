package argumentsandreturntype;

public class WithArgumentAndWithReturn {

	
	public int m1(double a) {
		return 55;
	}
	
	public static boolean m2(char a) {
		return true;
	}
	
	public static void main(String[] args) {
		WithArgumentAndWithReturn ob = new WithArgumentAndWithReturn();
		 int d = ob.m1(5.5);
		 System.out.println(d);
		 
		 System.out.println(m2('a'));
	}
}
