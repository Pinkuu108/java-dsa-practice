package common.interview.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//interface pinku{
//	void getmsg();
//}
public class Ananomous_InnerClass {

	public static void main(String[] args) {
//		pinku p=new pinku() {
//			
//			@Override
//			public void getmsg() {
//				System.out.println("pinku is run");
//				
//			}
//		};
//		p.getmsg();

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 3, 9);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}

		});
		System.out.println(list);

	}

}
