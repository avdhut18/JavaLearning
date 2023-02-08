package collectionsss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListssss {

	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		list.add("Mango");
		list.add(null);
		list.add(null);
		list.add("");
		list.add("Mango");
		list.add("");
		list.add("apple");
		
		for(String li:list)
			System.out.println(li);

	}
}
