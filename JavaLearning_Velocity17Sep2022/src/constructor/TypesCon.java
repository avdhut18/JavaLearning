package constructor;

public class TypesCon {

	public TypesCon(boolean c, int a, String m) {
		System.out.println("checking Parameterized Constructor");
	}
	
	public TypesCon() {
		System.out.println("checking Parameterless constructor");
	}
	
	public TypesCon(int a) {
		System.out.println("default");
	}
	
	
	public static void main(String[] args) {
		new TypesCon(true, 55, "Java");
		new TypesCon();
	}
}
