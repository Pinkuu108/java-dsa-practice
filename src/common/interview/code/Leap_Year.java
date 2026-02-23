package common.interview.code;

public class Leap_Year {

	public static void main(String[] args) {
		int year = 2016;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("This year is leap year");
		} else {
			System.out.println("This is not a leap year ");
		}

	}

}
