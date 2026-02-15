package common.interview.code;

public class Print_all_Primenums {

	public static void main(String[] args) {
		int num = 100;
		for (int i = 1; i <= num; i++) {
			int c = 0;
			for (int j = 1; j <= num; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.print(i + " ");
			}
		}

	}

}
