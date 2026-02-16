package common.interview.code;

import java.util.Scanner;

public class BiggestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = sc.nextInt();

		System.out.print("Enter b: ");
		int b = sc.nextInt();

		System.out.print("Enter c: ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("a is biggest");
		} else if (b > a && b > c) {
			System.out.println("b is biggest");
		} else if (c > a && c > b) {
			System.out.println("c is biggest");
		} else {
			System.out.println("Some numbers are equal");
		}

		sc.close();
	}
}
