package common.interview.code;

import java.util.Arrays;

public class Check_two_Array_Equalornot {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 56, 9 };
		int b[] = { 1, 2, 3, 4, 56, 9 };
		boolean equals = Arrays.equals(a, b);
		if (equals == true) {
			System.out.println("Both are same");
		} else {
			System.out.println("Not Same");
		}

	}

}
