package araaysss;

import java.util.Arrays;

public class SortingArrayyy {

	public static void main(String[] args) {
		int[] a = { 200, 55, 88, 878, 66699, 445, 755, 744, 74, 74, 5, 545, 1, 54, 85, 8, 5784, 578, 457, 848, 784, 87,
				84, 87, 8, 48, 784, 8, 8, 4, 8, 457, 4, 87, 54, 87, 5, 48, 45, 4, 84, 57, 5, 4, 87, 8, 48, 4, 7, 8, 48,
				7, 84, 8, 7, 84, 8, 6, 5, 65, 6, 5, 9, 6, 5 };

		Arrays.sort(a);
		for(int i=a.length-1; i>=0;i--)
			System.out.print(a[i]+ " ");
	}
}