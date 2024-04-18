package com.in28minutes.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2,3);
		// System.out.println(numbers.getNumber1());
		System.out.println(numbers.add());
		// System.out.println(numbers.addition());
		System.out.println(numbers.multiply());
		numbers.doubleValue();// Double both numbers
		System.out.println(numbers.getNumber1()); // give different value above
		System.out.println(numbers.getNumber2());
		System.out.println(numbers.addition()); // give different value when execute at different flow

	}

}
