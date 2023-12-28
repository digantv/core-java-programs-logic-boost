package core_java;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String inputString = sc.nextLine();
		countVowelsConsonants(inputString);
	}

	public static void countVowelsConsonants(String str) {

		int vowelsCount = 0;
		int consonantsCount = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch)) {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelsCount++;

				} else {
					consonantsCount++;
				}
			}
		}

		System.out.println("Vowels: " + vowelsCount);
		System.out.println("Consonants: " + consonantsCount);
	}
}
