package core_java;

import java.util.Scanner;

public class GcdOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int number2 = scanner.nextInt();

		while (number2 != 0) {
			int temp = number2;
			number2 = number1 % number2;
			number1 = temp;
		}

		System.out.println("The GCD is: " + number1);

		scanner.close();
	}

}
