package arrays;

public class Remove_Ele_Using_Num {
	public static void main(String[] args) {
		int n[] = { 3, 6, 8, 9, 0, 5, 7, 9 };
		int size = n.length;
		int num = 9;
		int index = -1;
		for (int i = 0; i < n.length; i++) {
			if (num == n[i]) {
				index = i;
				break;
			}
		}
		System.out.println("index is :" + index);

		for (int i = index; i < size - 1; i++) {
			n[i] = n[i + 1];
		}
		size--;
		for (int i = 0; i < size; i++) {
			System.out.print(n[i] + " ");
		}
	}
}
