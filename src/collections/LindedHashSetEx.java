package collections;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LindedHashSetEx {

	public static void main(String[] args) {

		Random op = new Random();

		Set<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i < 10; i++) {
			int num = op.nextInt(100);
			System.out.println(num);
			set.add(num);
		}
		
		System.out.println(set);
	}

}
