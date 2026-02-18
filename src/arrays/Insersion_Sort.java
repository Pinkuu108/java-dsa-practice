package arrays;

public class Insersion_Sort {

	public static void main(String[] args) {
		int a[] = { 3, 5, 1, 0, 8, 5, 22,11 };
		int temp;
		int j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i - 1;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;

			}
			a[j] = temp;

		}
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
