package practiceprogram;

import araaysss.ArrayInGetMethod;

public class CheckIngEncapsArray {

	
	public static void main(String[] args) {
		ArrayInGetMethod ii= new ArrayInGetMethod();
		int[] d = ii.getArray();
		
		for(int i = 0; i<d.length; i++)
			System.out.println(d[i]);
		
	}
}
