package core_java;

public class SmallestNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 13, 5, 26, 10 };

		System.out.println(smallestElementInArray(arr));
	}

	public static int smallestElementInArray(int[] arr) {

		int min = arr[0];

		for (int element : arr) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}

}
