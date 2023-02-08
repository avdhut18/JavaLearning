package labelling;

public class LabelingLoops {

	public static void main(String[] args) {
		OuterLoop: for (int i = 1; i <= 5; i++) {  //i = 1 
			for (int j = 1; j <= 5; j++) {  // j = 1 , 2, 3, 4  

				if (j == 4)   // j= 4 ==4 //true 
					break OuterLoop;
				
				System.out.println(j);  // 1, 2, 3
			}
		}
	}
}
