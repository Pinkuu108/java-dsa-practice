package arrays;

public class Second_Large_Num {

	public static void main(String[] args) {
		int n[]= {3,54,6,7,8,9,0,96,54};
		int large =n[0];
		int sclarge=n[0];
		for(int i=0;i<n.length;i++)
		{
			if(large<n[i])
			{
				sclarge=large;
				large=n[i];
			}
			else if(sclarge>n[i]&& sclarge!=large)
			{
				sclarge=n[i];
			}
		}
		System.out.println("Large number is ::"+large);
		System.out.println("Second large is ::"+sclarge);

	}

}
