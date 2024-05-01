package collections;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();
		
		set.add("abc");
		set.add("123");
		set.add("pres");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println(set);
				
		set.remove("123");
		
		System.out.println(set);
	}

}
