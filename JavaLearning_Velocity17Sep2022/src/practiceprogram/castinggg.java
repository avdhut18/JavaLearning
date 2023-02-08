package practiceprogram;

public class castinggg {

	public static void main(String[] args) {
		int a = 12;
		long b = 10;
		
		long c = a+b;
		byte d = (byte)c;
		System.out.println(d);
		
	}
}


// why jvm gives result in int form after arithmatic operations on byte,short, int 
// how explicit casting helps when programmer is sure that after arithmatic operation resulted value will not go beyond expected data type range
