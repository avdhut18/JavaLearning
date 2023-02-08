package araaysss;

public class SortingArrayy2 {

	public static void main(String[] args) {
		int[] arr = {100,55,88,66,77255,755,7455,75};
		int empty;
		
		for(int i = 0; i<arr.length; i++ )
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					empty = arr[i];
					arr[i]= arr[j];
					arr[j]= empty;
				}
			}
			System.out.print(arr[i]+ " ");
		}
		
		
	}
}
