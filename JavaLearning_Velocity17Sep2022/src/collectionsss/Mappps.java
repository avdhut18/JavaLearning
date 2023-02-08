package collectionsss;

import java.util.HashMap;
import java.util.Set;

public class Mappps {

	public static void main(String[] args) {
		HashMap<Integer,String> mapping = new HashMap<Integer,String>();
		mapping.put(11, "Avdhut");
		mapping.put(12, "Raju");
		mapping.put(13, "Ramesh");
		mapping.put(17, " ");
		mapping.put(14, "Avdhut");
		mapping.put(15, "check");
		mapping.put(16, "Ginger");
		
		///key cannot be duplicate 
		
	Set<Integer>keys = mapping.keySet();
	for(int key:keys)
		System.out.println(key+ " " + mapping.get(key));
	}
}
