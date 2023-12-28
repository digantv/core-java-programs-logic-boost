package core_java;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = scanner.nextLine();

		boolean isPalindrome = true;
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("The string is a palindrome!");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}
}
