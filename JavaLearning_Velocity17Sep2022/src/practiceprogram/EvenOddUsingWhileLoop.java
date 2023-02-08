package practiceprogram;

public class EvenOddUsingWhileLoop {

	public static void main(String[] args) {
	
		int x = 0;
		while(x<=100) {
			if(x%2==0) {
				System.out.print(x + "\t");  //0
			}
			++x;
		}
	}
}
