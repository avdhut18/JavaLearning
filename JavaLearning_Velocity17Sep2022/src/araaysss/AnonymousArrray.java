package araaysss;

public class AnonymousArrray {

	public static void m1(int[] a) {
		for(int i = 0; i<a.length; i++)
			System.out.println(a[i]);
	}
	
	public static void main(String[] args) {
		m1(new int[] {11,22,33,44,55});   // array passing without declartion  
	}
}
