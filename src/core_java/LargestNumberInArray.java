package core_java;

public class LargestNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 13, 5, 26, 10 };

		System.out.println(largestElementInArray(arr));
	}

	public static int largestElementInArray(int[] arr) {

		int max = arr[0];

		for (int element : arr) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}
}
