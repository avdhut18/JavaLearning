package collectionsss;

import java.util.HashSet;

public class Setttt {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Mango");
		set.add("Jackfruit");
		set.add("chikoo");
		set.add("Mango");
		set.add("Jackfruit");
		
		for(String s:set)
			System.out.println(s);
	}
}
