package common.interview.code;

public class Remove_Junk_Num {

	public static void main(String[] args) {
		String s = "@$&^%*&%^*&%pinkuna";
		s = s.replaceAll("[^1-9a-zA-Z]", "");
		System.out.println("After Remove Junk::" + s);

	}

}
