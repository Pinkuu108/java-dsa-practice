package common.interview.code;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "abc";
		String b = "cba";
		char[] ch = b.toCharArray();
		char[] ch2 = b.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch2);

		boolean v = Arrays.equals(ch, ch2);
		System.out.println(v);

	}

}
