package com.in28minutes.primitive.datatypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		/*
		 * if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch = 'I'
		 * || ch == 'o' || ch == 'u') { return true; } else { return false; }
		 */
		if (Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'E' || Character.toUpperCase(ch) == 'I'
				|| Character.toUpperCase(ch) == 'O' || Character.toUpperCase(ch) == 'U') {
			return true;
		}

		return false;
	}

	public boolean isNumber() {
		if (ch >= 48 && ch <= 57) {// between '0' and '9'
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) {// between 'a' and 'z'
			return true;
		}

		if (ch >= 65 && ch <= 90) {// between 'A' and 'Z'
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabets() {
		// char ch1 = Character.toLowerCase(ch);
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(Character.toUpperCase(ch));
		}

	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub

	}

	public boolean isConsonat() {
		/*
		 * if (ch >= 97 && ch <= 122 && (!(ch == 'a' || ch == 'e' || ch == 'i' || ch ==
		 * 'o' || ch == 'u'))) {// between 'a' // and 'z' return true; }
		 *
		 * if (ch >= 65 && ch <= 90 && (!(ch == 'A' || ch == 'E' || ch == 'I' || ch ==
		 * 'O' || ch == 'U'))) {// between 'A' // and 'Z' return true; }
		 */

		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;

	}

}
