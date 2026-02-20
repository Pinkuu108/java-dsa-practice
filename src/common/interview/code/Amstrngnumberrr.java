package common.interview.code;

public class Amstrngnumberrr {

	public static void main(String[] args) {
		String a = "pinku4";
		
		boolean p=false;
		
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				p=true;
				break;
			}
		}
		if(p==false)
		{
			System.out.println("no");
		}else
		{
			System.out.println("yes");
		}
		
		
		

	}

}
