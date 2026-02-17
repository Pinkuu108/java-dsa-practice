package arrays;

public class Bainary_Search2 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 60, 80, 90 };
		int str = 0;
		int end = arr.length - 1;
		
		int target = 80;
		boolean p = false;
		while (str <= end) {
			int mid = (str + end) / 2;
			if (target == arr[mid]) {
				System.out.println(" Target is presentt in index ::" + mid);
				p = true;
				break;
			} else {
				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					str = mid + 1;
				}
			}
		}
		if (p == false) {
			System.out.println("Targe is not presentt in the Array");
		}
	}

}
