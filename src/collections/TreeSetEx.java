package collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * In tree set data is stored in sorted format irrespective of the insertion order
 * */

public class TreeSetEx {

	public static void main(String[] args) {

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
