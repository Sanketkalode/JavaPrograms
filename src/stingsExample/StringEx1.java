package stingsExample;

import java.util.Date;

public class StringEx1 {

	public static void main(String[] args) {

		String greet = "HelloWorld";
		String sp = greet.substring(0,5);
		boolean bool = true;
		
		sp = sp+"!";
		
		System.out.println(sp);
		
		String all = String.join(" / ", "S", "M", "L", "XL");

		System.out.println(all);
		
		System.out.println(greet.equals(sp));
		
		System.out.printf("\n%b\n",bool);
		
		System.out.printf("%s %tB %<te, %<tY", "Due date:", new Date());
	}

}
