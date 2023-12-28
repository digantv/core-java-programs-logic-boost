package core_java;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();

		int wordCount = countWords(sentence);

		System.out.println("Number of words in the sentence: " + wordCount);

		scanner.close();
	}

	public static int countWords(String sentence) {
		String[] words = sentence.split("\\s+");
		return words.length;
	}
}
