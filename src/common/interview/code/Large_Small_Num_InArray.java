package common.interview.code;

public class Large_Small_Num_InArray {

	public static void main(String[] args) {
		int num[] = { 1, 3, 4, 5, 2, 34, 5, 6, 7, 8, 9 };
		int large = num[0];
		int small = num[0];

		for (int i = 0; i <= num.length - 1; i++) {
			if (num[i] > large) {
				large = num[i];
			} else if (num[0] < small) {
				small = num[i];
			}
		}
		System.out.println("Large number is ::" + large);
		System.out.println("Small Number is ::" + small);
	}

}
