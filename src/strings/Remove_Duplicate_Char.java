package strings;

public class Remove_Duplicate_Char {

	public static void main(String[] args) {
		String s = "programming";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!result.contains(String.valueOf(ch))) {
				result += ch;
			}
		}
		System.out.println(result);

	}

}
