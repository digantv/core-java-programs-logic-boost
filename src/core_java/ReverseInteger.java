package core_java;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number:");
		int number = sc.nextInt();

		int reversed = reverseInteger(number);

		System.out.println("Original: " + number);
		System.out.println("Reversed: " + reversed);
	}

	public static int reverseInteger(int num) {
		int reversedNum = 0;

		while (num != 0) {
			reversedNum = reversedNum * 10 + num % 10;
			num /= 10;
		}

		return reversedNum;
	}

}
