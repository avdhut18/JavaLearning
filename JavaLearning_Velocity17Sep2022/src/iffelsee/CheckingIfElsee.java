package iffelsee;

public class CheckingIfElsee {

	int a = 20;
	int b = 55;

	public static void main(String[] args) {
		CheckingIfElsee ob = new CheckingIfElsee();
		if (ob.a > ob.b) {
			System.out.println("if body");
		}
		else if(!(ob.a==20)) 
			System.out.println("else if");
		
		else if(ob.b==ob.a)
			System.out.println("both are equal");
		
		else  {
			System.out.println("normal else will run if none of else if is true");
		}
	}
}
