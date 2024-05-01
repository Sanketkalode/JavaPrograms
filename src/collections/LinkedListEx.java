package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {

		List<String> ll = new LinkedList<String>();
		ll.add("abcd");
		ll.add("pqr");
		ll.add("stqr");
		
		ListIterator<String> itr = (ListIterator<String>) ll.iterator();
		System.out.println(itr.next());
		itr.next();
		System.out.println(itr.next());
		itr.add("qwert");
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.next());
		itr.remove();
		
		
		System.out.println(ll);
	}

}
