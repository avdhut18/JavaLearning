package stringss;

public class StringMethodss {

	public static void main(String[] args) {

		String a = "        ";
		
		boolean var = a.isBlank();  // if only spaces are present still it is blank string 
		System.out.println(var);
		
		boolean var1 = a.isEmpty();   ///spaces counted as string char
		System.out.println(var1);
	
	}
}
