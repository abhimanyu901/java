package com.in28minutes.oops;

public class BookRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Book artOfProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();    */

	Book artOfProgramming = new Book(100);
	Book effectiveJava = new Book(200);
	Book cleanCode = new Book(300);

	System.out.println(artOfProgramming.getCopies());
	System.out.println(effectiveJava.getCopies());
	System.out.println(cleanCode.getCopies());

		artOfProgramming.read();
		effectiveJava.read();
		cleanCode.read();


		// artOfProgramming.noOfCopies = 23;
		artOfProgramming.setCopies(23);

		artOfProgramming.increaseCopies(100);

		artOfProgramming.decreaseCopies(50);

		System.out.println(artOfProgramming.getCopies());

		// effectiveJava.noOfCopies = 12;
		effectiveJava.setCopies(12);
		// cleanCode.noOfCopies = 34;
		cleanCode.setCopies(34);

	}

}
