package operatorsss;

public class OppsPract {

	public static void main(String[] args) {
		int x = 20; 
		int y = 30; 
		
		if(x==y) 
			System.out.println("it is equal");
		else 
			System.out.println("it is not equal");
		
		if(!(x==y)) 
			System.out.println("it is eqal");
		else 
			System.out.println("it is not equal");
		if(x<y)
			System.out.println("x is less ");
		else
			System.out.println("y is less");
		if(!(x<y))
			System.out.println("x is less");
		else
			System.out.println("y is less");
		if(x!=y)
			System.out.println("x is not equal to y");
		else
			System.out.println("x it equal ti y");
		if((x<y)&&(y==30))
			System.out.println("Both condition should get satisfy");
		
		if((x<y)||(y!=30))
			System.out.println("Any one condition should get satisfy");
	}
}
