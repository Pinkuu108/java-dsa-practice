package common.interview.code;

public class Duplicate_String {
	public static void main(String[] args) {
		String str[] = { "java", "c", "go", "java","c" };
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println("Di[licate Strong ::" + str[i]);
				}
			}

		}
	}
}
