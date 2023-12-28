package core_java;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number:");
		int number = sc.nextInt();

		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}