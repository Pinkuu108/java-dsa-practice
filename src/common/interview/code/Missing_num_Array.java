package common.interview.code;

public class Missing_num_Array {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 7 };
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = a[i] + sum1;
		}
		int sum2 = 0;
		for (int i = 0; i <= 7; i++) {
			sum2 += i;
		}
		System.out.println("Missing Number is ::" + (sum2 - sum1));

	}

}
