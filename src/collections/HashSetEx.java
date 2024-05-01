package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Random obj = new Random();

		List<Integer> l = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int num = obj.nextInt(6);
			l.add(num);
		}

		System.out.println(l);
		
		Set<Integer> s = new HashSet<Integer>(l);
		System.out.println(s);
		
	}

}
