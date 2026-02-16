package common.interview.code;

public class Amstrong_Num {
	public static void main(String[] args) {
		int num = 153;
		int temp1 = num;
		int len = 0;
		while (temp1 != 0) {
			temp1 = temp1 / 10;
			len++;
		}
		//System.out.println("Number length is ::" + len);
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int mul = 1;
			int t = temp % 10;
			
			for (int i = 1; i <= len; i++) {
				mul = mul * t;
			}
			sum = sum + mul;
			temp = temp / 10;
		}
		//System.out.println("Sum is ::" + sum);
		if(num==sum)
		{
			System.out.println(num+" Is Amstrong Number");
		}else
		{
			System.out.println(num+" Is not a amstrong Number ");
		}

	}
}
