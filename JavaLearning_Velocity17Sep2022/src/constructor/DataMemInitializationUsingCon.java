package constructor;

public class DataMemInitializationUsingCon {

	int a;
	int b;
	int c;
	
	public DataMemInitializationUsingCon(int a, int b, int c) {
		this.a=a; 
		this.b=b;
		this.c=c;
	}
	
	public static void main(String[] args) {
		DataMemInitializationUsingCon ob = new DataMemInitializationUsingCon(55,88,90);
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		
	}
}
