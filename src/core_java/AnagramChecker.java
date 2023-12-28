package core_java;

public class AnagramChecker {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		boolean isAnagram = checkAnagram(str1, str2);

		System.out.println(str1 + " and " + str2 + (isAnagram ? " are" : " are not") + " anagrams.");
	}

	public static boolean checkAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		int[] charCount = new int[26];

		for (char ch : s1.toCharArray()) {
			charCount[ch - 'a']++;
		}

		for (char ch : s2.toCharArray()) {
			charCount[ch - 'a']--;
		}

		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}
}
