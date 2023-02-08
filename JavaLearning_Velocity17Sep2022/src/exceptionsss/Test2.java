package exceptionsss;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		int a = 20;
		int b = 20; 
		int c = a+b;
		Thread.sleep(2000);
		System.out.println(c);
		Thread.sleep(2000);
		int d = c+a;
		Thread.sleep(2000);
		System.out.println(d);
	}
	
}
