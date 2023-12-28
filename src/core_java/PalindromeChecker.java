package core_java;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		boolean isDecimalPalindrome = isPalindrome(number);
		boolean isBinaryPalindrome = isPalindrome(Integer.toBinaryString(number));

		System.out.println("Decimal Palindrome: " + isDecimalPalindrome);
		System.out.println("Binary Palindrome: " + isBinaryPalindrome);

		scanner.close();
	}

	public static boolean isPalindrome(int num) {

		int originalNum = num;
		int reversedNum = 0;

		while (num > 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num /= 10;
		}

		return originalNum == reversedNum;
	}

	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}