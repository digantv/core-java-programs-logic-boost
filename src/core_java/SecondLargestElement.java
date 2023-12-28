package core_java;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] array = { 10, 5, 8, 20, 15 };

		int largest = array[0];
		int secondLargest = array[0];

		for (int element : array) {
			if (element > largest) {
				secondLargest = largest;
				largest = element;
			} else if (element > secondLargest && element != largest) {
				secondLargest = element;
			}
		}

		System.out.println("The second largest element is: " + secondLargest);
	}
}