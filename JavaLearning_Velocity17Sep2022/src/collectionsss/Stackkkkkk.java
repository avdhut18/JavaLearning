package collectionsss;

import java.util.Iterator;
import java.util.Stack;

public class Stackkkkkk {

	public static void main(String[] args) {
		Stack<String> stack= new Stack<String>();
		stack.push("Mango");
		stack.push("Jackfruit");
		stack.push("apple");
		stack.push("grapes");
		stack.push("Mango");
		stack.push("chikoo");
		
		stack.pop();
		Iterator<String> loop = stack.iterator();
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}
	}
}
