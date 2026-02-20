package arrays;

public class Remove_Using_Index {

	public static void main(String[] args) {
		int n[] = { 3, 6, 8, 9, 0, 5, 7, 9 };
		int size = n.length;
		int index = 2;
		for (int i = index; i < size - 1; i++) {
			n[i] = n[i + 1];
		}
		size--;
		for (int p : n) {
			System.out.print(p + " ");
		}

	}

}
