package common.interview.code;

public class Reverse_wholeString {

	public static void main(String[] args) {
		String str = "hello world";
		String word[] = str.split(" ");
		String fullstr = "";

		for (String s : word) {
			String half = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				half = half + s.charAt(i);
			}
			fullstr = fullstr + half + " ";

		}
		System.out.println(fullstr);
	}

}
