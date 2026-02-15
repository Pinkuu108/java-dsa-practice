package common.interview.code;

public class Prime_Num {
	public static void main(String[] args) {
		int num = 5;
		int c = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			System.out.println(num + ":: Is Prime Number");
		} else {
			System.out.println(num+" ::Not A Prime Number ");
		}
	}

}
