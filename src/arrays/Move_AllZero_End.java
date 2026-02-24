package arrays;

public class Move_AllZero_End {

	public static void main(String[] args) {
		int a[] = { 2, 5, 0, 6, 0, 3, 0, 5, 0 };
		int nz = 0;
		int z = 0;
		while (nz < a.length) {
			if (a[nz] != 0) {
				int temp = a[nz];
				a[nz] = a[z];
				a[z] = temp;
				nz++;
				z++;
			} else {
				nz++;
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
