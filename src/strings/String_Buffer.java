package strings;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("PInku world");
		//sb.append(" House");
		sb.delete(6, 8);
		//sb.replace(6, 11, "java");
		
		
		System.out.println(sb);
		
		
	}

}
