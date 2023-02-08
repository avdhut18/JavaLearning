package loopsss;

public class LoopBreaking {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			if(i>4)
				break;
			System.out.println(i); //1,2,3,4, 
		}
		System.out.println("brek ho gaya for loop");
	}
}
