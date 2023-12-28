package core_java;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		boolean isLeapYear = isLeapYear(year);

		if (isLeapYear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
