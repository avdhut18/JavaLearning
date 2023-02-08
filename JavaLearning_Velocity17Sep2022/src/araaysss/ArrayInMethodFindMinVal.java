package araaysss;

public class ArrayInMethodFindMinVal {

	public static void minimumValueFrmArray(int[] a) {
		int b = a[0];
		for(int i = 1; i<a.length; i++)
			if(b>a[i])
				b=a[i];
		System.out.println(b);

	}
	
	public static void main(String[] args) {
		int[] a = {12,558,556,6};
		minimumValueFrmArray(a);
	}
}
