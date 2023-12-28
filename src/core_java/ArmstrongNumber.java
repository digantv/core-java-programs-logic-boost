package core_java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number:");
		int number = sc.nextInt();
		boolean isArmstrong = isArmstrongNumber(number);

		System.out.println(number + (isArmstrong ? " is" : " is not") + " an Armstrong number.");
	}

	public static boolean isArmstrongNumber(int num) {

		int originalNumber = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit * digit; // Cube of the digit
			num /= 10;
		}

		return sum == originalNumber;
	}
}