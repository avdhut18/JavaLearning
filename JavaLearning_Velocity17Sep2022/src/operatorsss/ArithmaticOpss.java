package operatorsss;

public class ArithmaticOpss {

	int a = 20; 
	int b = 20; 
	
	public static void main(String[] args) {
		ArithmaticOpss ob = new ArithmaticOpss();
		int c = ob.a+ob.b;   //Addition
		System.out.println(c); 
		
		int a = 50;
		int b = 25;
		int d = a - b;    //subtraction
		System.out.println(d);
		
		int e = ob.a/ob.b;   //division 
		System.out.println(e);
		
		int v = a*b;     //Multiplication 
		System.out.println(v);
	}
}
