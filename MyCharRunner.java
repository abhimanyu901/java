package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('A');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonat());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
