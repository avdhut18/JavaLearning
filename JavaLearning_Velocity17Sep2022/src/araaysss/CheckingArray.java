package araaysss;

public class CheckingArray {

	//Single Dimension Array
	public static void main(String[] args) {
		int a[] = {11,22,11,22};  //array using literals
		int[] ar = new int[5];     // array using new keyword// Instantaneous Array 
		ar[0] = 11;
		ar[1] = 12;
		ar[2] = 13;
		ar[3] = 14;
		ar[4] = 15;
		
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
		
		
	}
}
