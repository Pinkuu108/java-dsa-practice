package arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		int a[] = { 3, 5, 1, 0, 8, 5, 22 };
		int min;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
