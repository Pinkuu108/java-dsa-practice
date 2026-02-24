package common.interview.code;

public class Amstrngnumberrr {

	public static void main(String[] args) {
		int a[] = { 2, 3, 5, 4, 8, 7, 9, 0, 1, 2, 3 };

		int str = 0;
		int end = a.length - 1;
	
		int target = 7;
		boolean b = false;
		while (str <=end) {
			int mid = (str + end) / 2;
			if (target == a[mid]) {
				System.out.println(mid);
				b = true;
				break;

			} else if (a[mid] < target) {
				str = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if (b == false) {
			System.out.println("Number is not present in the array");
		}
	}

}
