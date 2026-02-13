package common.interview.code;

public class Rev_number {

	public static void main(String[] args) {
		int num = 123;
		int rev = 0;

		while (num != 0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;

		}
		System.out.println("Rev_number.main():" + rev);

	}

}
