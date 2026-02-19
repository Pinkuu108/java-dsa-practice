package arrays;

public class Quick_sort {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 2, 8, 9, 1, 3, 5 };
		int len = arr.length - 1;
		Quick_sort qs = new Quick_sort();
		qs.recurssion(arr, 0, len );
		qs.printarr(arr);

	}

	int practition(int arr[], int low, int high) {
		int mid = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < mid) {
				low++;
			}
			while (arr[high] > mid) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	void recurssion(int[] arr, int low, int high) {
		int p = practition(arr, low, high);
		if (low < p - 1) {
			recurssion(arr, low, p - 1);
		}
		if (p < high) {
			recurssion(arr, p, high);
		}
	}

	void printarr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
