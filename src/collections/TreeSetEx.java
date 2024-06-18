package collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * In tree set data is stored in sorted format irrespective of the insertion order
 * */

public class TreeSetEx {

	public static void main(String[] args) {

		/*
		* Simply put, the TreeSet is a sorted collection that extends the AbstractSet class and
		* implements the NavigableSet interface.

			Here’s a quick summary of the most important aspects of this implementation:

				It stores unique elements
				It doesn’t preserve the insertion order of the elements
				It sorts the elements in ascending order
				It’s not thread-safe
		* */

		Random op = new Random();

		Set<Integer> set = new TreeSet<>();

		for (int i = 0; i < 10; i++) {
			int num = op.nextInt(100);
			System.out.println(num);
			set.add(num);
		}
		
		System.out.println(set);
	}

}
