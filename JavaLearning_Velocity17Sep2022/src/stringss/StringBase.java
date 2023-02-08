package stringss;

public class StringBase {

	public static void main(String[] args) {

	String a = "avdhut";  // a ref variable pointing to SCP region object consist of "avdhut"
	String b = "avdhut"; // b ref vaiable pointing to SCP region alredy created object consist of "avdhut"
	b = "automation";   
	// as b value has changed and new value containing obj is not present it will create new object and b will point to new object
	System.out.println(a);
	System.out.println(b);	
	}
}
