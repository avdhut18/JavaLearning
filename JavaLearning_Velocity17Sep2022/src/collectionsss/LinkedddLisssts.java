package collectionsss;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedddLisssts {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("Mango");
		link.add("apple");
		link.add("Jackfruit");
		link.add("Mango");
		
		
		Iterator loop = link.iterator();
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}
	}
}
