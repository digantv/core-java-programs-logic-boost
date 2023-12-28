package core_java;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 5, 6, 1 };

		System.out.println("Array before removing duplicates: " + Arrays.toString(array));

		int[] resultArray = removeDuplicates(array);

		System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
	}

	public static int[] removeDuplicates(int[] array) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int value : array) {
			set.add(value);
		}

		int[] resultArray = new int[set.size()];
		int index = 0;
		for (int value : set) {
			resultArray[index++] = value;
		}

		return resultArray;
	}
}