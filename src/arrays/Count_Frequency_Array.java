package arrays;

public class Count_Frequency_Array {

	public static void main(String[] args) {
		int n[] = { 1, 6, 9, 0, 3, 5, 7, 2, 8, 9 };

		for (int i = 0; i < n.length; i++) {
			int count = 0;
			boolean check = false;
			for (int k = 0; k < i; k++) {
				if (n[i] == n[k]) {
					check = true;
					break;
				}
			}
			if (check) {
				continue;
			}
			;
			for (int j = 0; j < n.length; j++) {
				if (n[i] == n[j]) {
					count++;
				}
			}
			System.out.println(n[i] + " " + count);
		}

	}

}
