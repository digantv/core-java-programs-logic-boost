package core_java;

public class CalculateAverage {
	public static void main(String[] args) {
		
		int[] numbers = { 10, 5, 8, 20, 15 };

		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		double average = (double) sum / numbers.length;

		System.out.println("The average of the numbers is: " + average);
	}
}
