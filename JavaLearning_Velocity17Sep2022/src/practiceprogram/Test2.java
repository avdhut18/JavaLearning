package practiceprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		String a = "nitin";   //reverse nitin
	String empty ="";
		for(int i = a.length()-1;i>=0;i--)
			empty= empty + a.charAt(i);  //    nitin 

		System.out.println(empty);
		System.out.println(empty.equals(a));
		if(empty.equals(a))
			System.out.println(a + " is pallingdrome string ");
		else
			System.out.println(a+ " is NOT pallingdrome string ");
	}
}
  /// 
