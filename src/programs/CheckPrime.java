package programs;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number");
		int num = scan.nextInt();

		boolean flag = true;

		if (num <= 2) {
			flag = true;
		} else {
			for (int i = 2; i < num - 1; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println("Number is prime Number");
		} else {
			System.out.println("Number is not a prime number");
		}

	}

}
