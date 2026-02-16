package common.interview.code;

public class Ele_Present_InArrays {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 56, 9 };
		boolean p = false;
		int num = 90;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				System.out.println("Number is Present index ::" + i);
				p = true;
				break;
			}
		}
		if (p == false) {
			System.out.println("Number is not present on this Array");
		}

	}

}
