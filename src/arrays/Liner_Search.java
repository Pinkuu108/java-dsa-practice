package arrays;

public class Liner_Search {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 60, 80, 90 };
		boolean b=false;
		int target=100;
		for(int i=0;i<arr.length-1;i++)
		{
			if(target==arr[i])
			{
				System.out.println("Index is ::"+i);
				b=true;
				break;
			}
		}
		if(!b)
		{
			System.out.println("Elemeantes is not present in the Array");
		}
		

	}

}
