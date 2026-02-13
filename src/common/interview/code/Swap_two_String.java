package common.interview.code;

public class Swap_two_String {
	public static void main(String[] args) {
		String a = "Pinku";
		String b = "Chinu";
		System.out.println("Before swap a:" + a + "|| Before swap  b:" + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(a.length() - b.length());

		System.out.println("After swap a:" + a + "|| After swap  b:" + b);
	}
}
