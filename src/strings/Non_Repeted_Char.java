package strings;

public class Non_Repeted_Char {

	public static void main(String[] args) {
		String s = "acbcashbaildha";

		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int c = 0;

			for (int j = 0; j < s.length(); j++) {
				if (ch == s.charAt(j)) {
					c++;
				}
			}
			if (c == 1) {
				System.out.println(ch);
				break;
			}
		}

	}

}
