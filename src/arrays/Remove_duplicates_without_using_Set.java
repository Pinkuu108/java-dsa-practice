package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_duplicates_without_using_Set {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 32, 1, 6, 7, 989));
		List<Integer> newlist = new ArrayList<Integer>();

		for (Integer num : list) {
			if (!newlist.contains(num)) {
				newlist.add(num);
			}

		}
		for (Integer integer : newlist) {
			System.out.println(integer + " ");
		}

	}

}
