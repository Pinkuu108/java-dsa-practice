package arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		int a[] = { 3, 5, 1, 0, 8, 5, 22 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
                 if(a[j]>a[j+1])
                 {
                	 int temp=a[j];
                	 a[j]=a[j+1];
                	 a[j+1]=temp;
                 }
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
			
		}
	}

}
