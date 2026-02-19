package common.interview.code;

public class Char_Count {

	public static void main(String[] args) {
		String s = "pinkuna prusty";
		int f[] = new int[256];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			f[ch]++;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (f[ch] != 0) {
				System.out.println(ch + " " + f[ch]);
			}
		}

	}

}
