package constructirinheritancecheck3;

public class ChildCon extends ParentCon {

	public ChildCon(int a) {  // Child con will always call parent constructor in all cases 
		super(true);
		System.out.println("child con");
	}
	
	public static void main(String[] args) {
		new ChildCon(22);
	}
} 