package arrays;

public class Bainary_Search {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 60, 80, 90 };
		int str = 0;
		int end = arr.length - 1;
		int num = 20;
		boolean p = false;
		while (str <= end) {
			int mid = (str + end) / 2;
			if (num == arr[mid]) {
				System.out.println("Number is presnet index::" + mid);
				p = true;
				break;
			} else if (num > arr[mid]) {
				str = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if (p == false) {
			System.out.println("Element not present in the array");
		}

	}

}
