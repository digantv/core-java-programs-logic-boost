package core_java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number:");
		int number = sc.nextInt();
		long factorial = calculateFactorial(number);

		System.out.println("Factorial of " + number + " is: " + factorial);
	}

	public static long calculateFactorial(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		}

		long factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}

		return factorial;
	}
}