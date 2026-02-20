package arrays;

import java.util.Arrays;

public class Sum_twoArrays {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 6, 7 };
		int b[] = { 9, 8, 2, 4,0 };
		int len1 = a.length;
		int len2 = b.length;
		int c[] = new int[len1 + len2];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[len1 + i] = b[i];

		}
		Arrays.sort(c);
		for (int p : c) {
			System.out.print(p + " ");
		}

	}

}
