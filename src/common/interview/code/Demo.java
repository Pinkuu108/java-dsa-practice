package common.interview.code;

public class Demo {

	public static void main(String[] args) {

		String s = "multithreading";
		int f[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			f[ch]++;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (f[ch] != 0) {
					System.out.println(ch + " " + f[ch]);
					f[ch]=0;
				}
			}
		}

	}

}
