package programs;

import java.util.Scanner;

public class StaticImports {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = Integer.parseInt(scan.next());
		System.out.println("Square of given number is "+ (int)Math.pow(n, 2));
	}

}
