package araaysss;

public class MultiDirectionalArray {

	
	public static void main(String[] args) {
	
		//single directional array
		int b[] = {11,22,33,44,55}; // single dimentinal array initialization
		for(int i = 0; i < b.length; i++)
			System.out.println(b[i]); 
		
		System.out.println("");
	
		// multidirectional array (2D array)
		int a [][]  = {{11,22,33,},{44,55,66},{77,88,99}};  // Multidirectional (2D) array initialization 
 		// printing  
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {   
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
