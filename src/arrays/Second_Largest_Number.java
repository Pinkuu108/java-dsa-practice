package arrays;

import java.util.Arrays;
import java.util.List;

public class Second_Largest_Number {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 6, 8, 2, 9, 80, 2);
		int large = Integer.MIN_VALUE;
		int sclarge = Integer.MIN_VALUE;
		for (int num : list) {
			if (num>large ) {
				
				sclarge=large;
				large=num;
				
			}else if(num > sclarge)
			{
				sclarge=num;
			}
		}
	   System.out.println("Sc large"+sclarge);

	}

}
