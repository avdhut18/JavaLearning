package araaysss;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {11,12,13,14,15,16,17};  //size = 5; range 0 to 4
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		System.out.println("");
		
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
	}
}
