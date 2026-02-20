package arrays;

public class Remove_ele_skip {

	public static void main(String[] args) {
		int n[] = { 3, 5, 7, 8, 90, 5 };
		int size = n.length;
		int num = 5;
		int k = 0;
		for (int i = 0; i < size; i++) {
			if (n[i] != num) {
				n[k] = n[i];
				k++;
			}

		}
		size = k;
		for (int i = 0; i < size; i++) {
			System.out.print(n[i] + " ");
		}

	}

}
