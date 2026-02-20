package arrays;

public class Add_New_ele {

	public static void main(String[] args) {
		int n[] = { 3, 6, 8, 3, 1, 23, 9, 0 };
		int num = 11;
		int index = 5;
		int nn[] = new int[n.length + 1];
		for (int i = 0; i < index; i++) {
			nn[i] = n[i];
		}
		nn[index] = num;
		for (int i = index; i < nn.length-1; i++) {
			nn[i + 1] = n[i];
		}

		for (int p : nn) {
			System.out.print(p + " ");
		}
	}

}
