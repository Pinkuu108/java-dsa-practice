package arrays;

public class All_zero_ThenRest {

	public static void main(String[] args) {
		int n[] = { 6, 0, 5, 0, 4, 0, 9, 0 };

		for (int i = 0; i < n.length; i++) {
			if (n[i] == 0) {
				System.out.print(n[i] + " ");
			}
		}
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 0) {
				System.out.print(n[i] + " ");
			}
		}

	}

}
