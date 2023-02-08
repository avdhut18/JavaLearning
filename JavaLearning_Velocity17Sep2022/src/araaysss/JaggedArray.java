package araaysss;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] a = new int[3][];
		a[0] = new int[] {11};
		a[1] = new int[] {44,55,66};
		a[2] = new int[] {77,88,99,100};
		
		for(int i = 0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
