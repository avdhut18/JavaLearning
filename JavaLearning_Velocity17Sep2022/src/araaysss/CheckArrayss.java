package araaysss;

public class CheckArrayss {

	int a = 20; //4byte
	
	public static void main(String[] args) {
		int[] a = new int[100];  // one of way of writing array using new keyword
		
		//initialization of an array 
		
		a[0] = 11;
		a[1] = 22;
		a[2] = 33;
		a[3] = 44;
		a[4] = 55;
		
		for(int i=0;i<5;i++)
			System.out.println(a[i]);
		
	}
}
