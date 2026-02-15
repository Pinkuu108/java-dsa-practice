package common.interview.code;

import java.util.HashSet;

public class Remove_Duplicate_Int {

	public static void main(String[] args) {
		int num[] = { 1, 3, 4, 5, 2, 34, 5, 6, 7, 8, 9 };
		HashSet<Integer> s = new HashSet<Integer>();

		for (Integer i : num) {
			s.add(i);

		}
		
		System.out.println(s);

	}

}
