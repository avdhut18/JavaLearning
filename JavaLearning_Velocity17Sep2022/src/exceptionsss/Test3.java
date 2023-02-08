package exceptionsss;

public class Test3 {

	public void totalMarks(int marks) {
		if (marks <= 40)
			throw new IllegalArgumentException("Failed");
		else
			System.out.println("Passed");
	}

	public static void main(String[] args) {
		Test3 ref = new Test3();
		try {
			ref.totalMarks(39);	
		}
		catch(IllegalArgumentException ref1) {
			System.out.println(ref1.getMessage());
		}
		ref.totalMarks(50);

	}
}
