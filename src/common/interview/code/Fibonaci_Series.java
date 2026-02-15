package common.interview.code;

public class Fibonaci_Series {

	public static void main(String[] args) {
		int num=10;
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<num;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
